package GradeManagement.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter

public class Grades {
    private Exam exam;
    private Student student;
    private List<GradeHistory> gradeHistory = new ArrayList<>();

    public void addHistory(double value, String reason, LocalDateTime dateTime) {
        gradeHistory.add(new GradeHistory(reason, dateTime, value));
    }

}