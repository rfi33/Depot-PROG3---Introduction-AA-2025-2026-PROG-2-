package GradeManagement.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor


public class Exam {
    private int id;
    private String title;
    private Course subject;
    private LocalDateTime timeExam;
    private int coef;
}
