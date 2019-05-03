package be.intecbrussel.Model;

import java.util.Objects;

public abstract class Employees extends Person{
    private double salary;
    private Jobs jobs;

    public Employees(){

    }

    public Employees(double salary, Jobs jobs) {
        this.salary = salary;
        this.jobs = jobs;
    }

    public Employees(int ID, String name, int age, String gender, String address, String phoneNumber, String emailAddress, double salary, Jobs jobs) {
        super(ID, name, age, gender, address, phoneNumber, emailAddress);
        this.salary = salary;
        this.jobs = jobs;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employees employees = (Employees) o;
        return Double.compare(employees.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }
}
