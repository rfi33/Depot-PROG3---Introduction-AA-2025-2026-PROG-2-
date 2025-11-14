package GradeManagement.com;

import lombok.Getter;

@Getter
public class Student extends Users {
    private String group;
    private Tutor tutor;

    public Student(int id, String firstName, String lastName, String dateOfBirth, String email, String phoneNumber) {
        super(id, firstName, lastName, dateOfBirth, email, phoneNumber);
    }}
