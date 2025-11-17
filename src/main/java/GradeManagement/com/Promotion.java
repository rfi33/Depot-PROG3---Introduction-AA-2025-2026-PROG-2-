package GradeManagement.com;

import java.util.List;

public class Promotion {
    private int id;
    private List<Group> group;

    public int getId() {
        return id;
    }

    public List<Group> getGroup() {
        return group;
    }

    public Promotion(int id, List<Group> group) {
        this.id = id;
        this.group = group;
    }
}
