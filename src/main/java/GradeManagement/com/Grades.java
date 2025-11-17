package GradeManagement.com;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grades {
    private Exam exam;
    private Student student;
    private List<GradeHistory> gradeHistory = new ArrayList<>();

    public Grades(Exam exam1, Student student, List<GradeHistory> gradeHistory1) {
    }

    public void addHistory(double value, String reason, Instant dateTime) {
        gradeHistory.add(new GradeHistory(reason, dateTime, value));
    }

    public Exam getExam() {
        return exam;
    }

    public Student getStudent() {
        return student;
    }

    public List<GradeHistory> getGradeHistory() {
        return gradeHistory;
    }
}