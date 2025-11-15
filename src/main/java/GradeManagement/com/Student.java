package GradeManagement.com;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student extends Users {
    private Group group;
    private Tutor tutor;

    public Student(int id, String firstName, String lastName, String dateOfBirth, String email, String phoneNumber,Group group,Tutor tutor) {
        super(id, firstName, lastName, dateOfBirth, email, phoneNumber);
        this.group = group;
        this.tutor = tutor;
    }}


