package GradeManagement.com;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Teacher extends Users{
    public Teacher(int id, String firstName, String lastName, String dateOfBirth, String email, String phoneNumber) {
        super(id, firstName, lastName, dateOfBirth, email, phoneNumber);
    }
}
