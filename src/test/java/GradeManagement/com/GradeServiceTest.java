package GradeManagement.com;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradeServiceTest {

    private GradeService gradeService;
    private Student student;
    private Course prog2;
    private Exam exam1;
    private Exam exam2;


    @BeforeEach
     void setUp() {
        gradeService = new GradeService();

         List<Student> students = new ArrayList<>();
         Group L1 = new Group(students,"L1");

         Tutor Koto = new Tutor(1, "Rakoto", "Be", LocalDate.of(1980, 5, 12), "Rakoto@mail.com", "+261340800422", "Father");

         Student student = new Student(1, "Rakoto", "Soa", LocalDate.of(2003, 2, 22), "Rasoa@gmail.com", "+261348200145", L1, Koto);

         Teacher teacher = new Teacher(1, "Ratsimba", "Kolo", LocalDate.of(1985, 10, 30), "Ratsimba@gmail.com", "+261381205022", Teacher.SPECIALITY.BACKEND);

         Course prog2 = new Course(1, "PROG2", 6, teacher);

         GradeHistory gradeHistory1 = new GradeHistory("primary grade",Instant.parse("2025-05-30T11:00:00Z"),13.00);

         Exam exam1 = new Exam(1, "First exam", prog2, 3,Instant.parse("2025-05-20T10:00:00Z"));
         Exam exam2 = new Exam(1,"Final exam",prog2,3,Instant.parse("2025-06-30T08:00:00Z"));
     }


    @Test
    void getCourseGrades() {
        List<GradeHistory> gradeHistory1 = new ArrayList<>();
        gradeHistory1.add(new GradeHistory("primary grade", Instant.parse("2025-05-21T11:00:00Z"),12.00));
        Grades grade1 = new Grades(exam1, student, gradeHistory1);

        List<GradeHistory> gradeHistory2 = new ArrayList<>();
            gradeHistory2.add(new GradeHistory("primary grade",Instant.parse("2025-07-01T11:00:00Z"),16.00));

            Grades grade2 = new Grades(exam2, student, gradeHistory2);

            double result1 = gradeService.getCourseGrades(prog2, student,Instant.parse("2025-07-02T10:00:00Z"));
            assertEquals(14.0, result1, 0, "Final course grade should be 14.0");

            double result2 = gradeService.getCourseGrades(prog2, student,Instant.parse("2025-06-15T10:00:00Z"));
            assertEquals(6.0, result2, 0, "Grade should be 6.0 after the first exam only");

            double result3 = gradeService.getCourseGrades(prog2, student, Instant.parse("2025-05-01T10:00:00Z"));
            assertEquals(0.0, result3, 0, "Grade should 0.0 before the exam");
}
    @Test
    void getExamGrade() {
        List<GradeHistory> gradeHistory1 = new ArrayList<>();
        gradeHistory1.add(new GradeHistory("primary grade", Instant.parse("2025-05-21T11:00:00Z"),13.00));
        gradeHistory1.add(new GradeHistory("correction", Instant.parse("2025-05-23T14:00:00Z"), 15.00));

        Grades grades = new Grades(exam1,student,gradeHistory1);

        double result1 = gradeService.getExamGrade(exam1,student,Instant.parse("2025-05-22T10:00:00Z"));
        assertEquals(13.00,result1,0,"Grade should 13.00");

        double result2 = gradeService.getExamGrade(exam1, student,
                Instant.parse("2025-05-24T10:00:00Z"));
        assertEquals(15.00, result2, 0, "Grade should 15.00 after correction");

        double result3 = gradeService.getExamGrade(exam1, student,
                Instant.parse("2025-05-20T10:00:00Z"));
        assertEquals(0.0, result3, 0, "Grade should 0.0 before the exam");

        double result4 = gradeService.getExamGrade(exam2, student,
                Instant.parse("2025-07-01T10:00:00Z"));
        assertEquals(0.0, result4, 0, "Grade should 0.0 before the exam");
    }
}
