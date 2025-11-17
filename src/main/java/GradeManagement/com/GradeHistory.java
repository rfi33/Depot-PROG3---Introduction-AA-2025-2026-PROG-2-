package GradeManagement.com;


import java.time.Instant;

public class GradeHistory {
    private String reason;
    private Instant dateTime;
    private double value;

    public String getReason() {
        return reason;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public double getValue() {
        return value;
    }

    public GradeHistory(String reason, Instant dateTime, double value) {

    }

}
