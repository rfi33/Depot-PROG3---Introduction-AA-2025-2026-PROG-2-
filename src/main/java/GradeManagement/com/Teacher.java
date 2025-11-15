package GradeManagement.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Teacher extends Users{
    private SPECIALITY speciality;

    public Teacher(int id, String firstName, String lastName, String dateOfBirth, String email, String phoneNumber,SPECIALITY speciality) {
        super(id, firstName, lastName, dateOfBirth, email, phoneNumber);
        this.speciality = speciality;
    }


    public enum SPECIALITY{
        FRONTEND,
        BACKEND,
        OBS,
        CYBERSECURITY,
        DATAENGINEER
    }
}
