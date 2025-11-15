package GradeManagement.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter

public class Group {
    private String group;
    private List<Student> students;
}
