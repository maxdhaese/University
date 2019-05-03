package be.intecbrussel.Model;

import java.util.Objects;

public class Staff extends Employees{

    public Staff() {
    }

    public Staff(double salary, Jobs jobs) {
        super(salary, jobs);
    }

    public Staff(int ID, String name, int age, String gender, String address, String phoneNumber, String emailAddress, double salary, Jobs jobs) {
        super(ID, name, age, gender, address, phoneNumber, emailAddress, salary, jobs);
    }
    

}
