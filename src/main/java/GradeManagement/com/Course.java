package GradeManagement.com;


public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;

    public String getLabel() {
        return label;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getCredits() {
        return credits;
    }

    public Course(int id, String label, int credits, Teacher teacher) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.teacher = teacher;
    }
}
