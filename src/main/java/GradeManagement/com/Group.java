package GradeManagement.com;

import java.util.List;

public class Group {
    private String id;
    private List<Student> students;

    public Group(List<Student> students, String id) {
        this.students = students;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }
}
