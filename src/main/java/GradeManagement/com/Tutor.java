package GradeManagement.com;

import java.time.LocalDate;

public class Tutor extends Users{
    private String description;

    public Tutor(int id, String firstName, String lastName, LocalDate dateOfBirth, String email, String phoneNumber, String description) {
        super(id, firstName, lastName, dateOfBirth, email, phoneNumber);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
