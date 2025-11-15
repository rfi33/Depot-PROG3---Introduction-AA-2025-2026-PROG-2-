package GradeManagement.com;

import lombok.Getter;

@Getter

public class Tutor extends Users{
    private String description;

    public Tutor(int id, String firstName, String lastName, String dateOfBirth, String email, String phoneNumber,String description) {
        super(id, firstName, lastName, dateOfBirth, email, phoneNumber);
        this.description = description;
    }
}
