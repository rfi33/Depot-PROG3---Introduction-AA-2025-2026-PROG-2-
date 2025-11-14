package GradeManagement.com;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Users {
    private int id ;
    private String firstName ;
    private String lastName ;
    private String birthDate ;
    private String email;
    private String phoneNumber;

    public Users(int id, String firstName, String lastName, String dateOfBirth, String email, String phoneNumber) {
    }
}
