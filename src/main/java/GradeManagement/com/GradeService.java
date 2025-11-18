package GradeManagement.com;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GradeService{


    private List<Grades> grades;

    public double getExamGrade(Exam exam, Student student, Instant t){

        return grades.stream()
                .filter(grade ->grade.getStudent().getId() == student.getId())
                .filter(grade-> grade.getExam().getId() == exam.getId())
                .flatMap(grade ->grade.getGradeHistory().stream())
                .filter(time -> time.getDateTime().isBefore(t))
                .max(Comparator.comparing(GradeHistory::getDateTime))
                .map(GradeHistory::getValue)
                .orElse(0.0);
    }

    public double getCourseGrades(Course course,Student student,Instant t){

        return  grades.stream()
                .filter(grade -> grade.getStudent().getId() == student.getId())
                .filter(grade -> grade.getExam().getCourse().getId() == course.getId())
                .mapToDouble(grade -> {
                    double examGrade = getExamGrade(grade.getExam(),student,t);
                    double courseCoef = grade.getExam().getCourse().getCredits();
                    return examGrade * courseCoef;
                })
                .sum();
    }
}
