package GradeManagement.com;

import java.time.Instant;

public class Exam {
    private int id;
    private String title;
    private Course course;
    private Instant timeExam;
    private int coef;

    public Exam(int id, String title, Course course, int coef, Instant timeExam) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.coef = coef;
        this.timeExam = timeExam;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Course getCourse() {
        return course;
    }

    public Instant getTimeExam() {
        return timeExam;
    }

    public int getCoef() {
        return coef;
    }
}
