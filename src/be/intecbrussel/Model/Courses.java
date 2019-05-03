package be.intecbrussel.Model;

public enum  Courses {
    BIOLOGY("Biology"),
    CHEMISTRY("Chemistry"),
    MATHEMATICS("Mathematics"),
    ENGLISH("French"),
    FRENCH("French"),
    DUTCH("Dutch");

    private String courseName;

    Courses(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
