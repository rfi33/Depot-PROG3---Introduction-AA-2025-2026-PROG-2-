package GradeManagement.com;

import java.time.LocalDate;


public class Student extends Users {
    private Group group;
    private Tutor tutor;

    public Student(int id, String firstName, String lastName, LocalDate BirthDate, String email, String phoneNumber,Group group,Tutor tutor) {
        super(id, firstName, lastName, BirthDate, email, phoneNumber);
        this.group = group;
        this.tutor = tutor;
    }

    public Group getGroup() {
        return group;
    }

    public Tutor getTutor() {
        return tutor;
    }
}


