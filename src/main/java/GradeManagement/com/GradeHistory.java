package GradeManagement.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor

public class GradeHistory {
    private String reason;
    private LocalDateTime dateTime;
    private double value;

    public GradeHistory(String reason, LocalDateTime dateTime, double value) {
    }

}
