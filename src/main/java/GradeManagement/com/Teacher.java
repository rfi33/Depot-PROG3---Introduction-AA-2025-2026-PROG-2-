package GradeManagement.com;

import java.time.LocalDate;

public class Teacher extends Users{
    private SPECIALITY speciality;

    public Teacher(int id, String firstName, String lastName, LocalDate birthDate, String email, String phoneNumber,SPECIALITY speciality) {
        super(id, firstName, lastName, birthDate, email, phoneNumber);
        this.speciality= speciality;
    }

    public SPECIALITY getSpeciality() {
        return speciality;
    }

    public enum SPECIALITY{
        FRONTEND,
        BACKEND,
        OBS,
        CYBERSECURITY,
        DATAENGINEER
    }
}
