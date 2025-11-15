package GradeManagement.com;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;
}
