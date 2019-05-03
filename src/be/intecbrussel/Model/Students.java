package be.intecbrussel.Model;

import java.util.Arrays;
import java.util.Objects;

public class Students extends Person {

    private Status status;
    private Curriculum [] curriculum;

    public Students(){

    }

    public Students(Status status, Curriculum[] curriculum) {
        this.status = status;
        this.curriculum = curriculum;
    }

    public Students(int ID, String name, int age, String gender, String address, String phoneNumber, String emailAddress, Status status, Curriculum[] curriculum) {
        super(ID, name, age, gender, address, phoneNumber, emailAddress);
        this.status = status;
        this.curriculum = curriculum;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Curriculum[] getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum[] curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        return super.toString() +
                " status:" + status +
                ", curriculum:" + Arrays.toString(curriculum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Students students = (Students) o;
        return status == students.status &&
                Arrays.equals(curriculum, students.curriculum);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), status);
        result = 31 * result + Arrays.hashCode(curriculum);
        return result;
    }
}
