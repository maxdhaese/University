package be.intecbrussel.Model;

import java.util.Arrays;

public class Faculty {
    private Courses [] courses;
    private String name;

    public Faculty() {
    }

    public Faculty(Courses[] courses, String name) {
        this.courses = courses;
        this.name = name;
    }

    public Courses[] getCourses() {
        return courses;
    }

    public void setCourses(Courses[] courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "courses=" + Arrays.toString(courses) +
                ", name='" + name + '\'' +
                '}';
    }
}
