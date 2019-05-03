package be.intecbrussel.Model;

public class Teachers extends Employees{

    private Faculty faculty;

    public Teachers(Faculty faculty) {
        this.faculty = faculty;
    }

    public Teachers(double salary, Jobs jobs, Faculty faculty) {
        super(salary, jobs);
        this.faculty = faculty;
    }

    public Teachers(int ID, String name, int age, String gender, String address, String phoneNumber, String emailAddress, double salary, Jobs jobs, Faculty faculty) {
        super(ID, name, age, gender, address, phoneNumber, emailAddress, salary, jobs);
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return super.toString() +
                " faculty:" + faculty;
    }


}
