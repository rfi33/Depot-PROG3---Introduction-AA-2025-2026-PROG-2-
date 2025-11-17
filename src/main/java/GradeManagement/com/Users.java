package GradeManagement.com;

import java.time.LocalDate;

public class Users {
    private int id ;
    private String firstName ;
    private String lastName ;
    private LocalDate birthDate ;
    private String email;
    private String phoneNumber;

    public Users(int id, String firstName, String lastName, LocalDate BirthDate, String email, String phoneNumber) {
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
