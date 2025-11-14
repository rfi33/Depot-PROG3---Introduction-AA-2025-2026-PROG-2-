package GradeManagement.com;

import lombok.Getter;

@Getter

public class Tutor extends Users{

    public Tutor(int id, String firstName, String lastName, String dateOfBirth, String email, String phoneNumber) {
        super(id, firstName, lastName, dateOfBirth, email, phoneNumber);
    }
}
