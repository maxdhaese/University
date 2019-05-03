package be.intecbrussel.Model;

public enum  Jobs {

    BIOLOGYTEACHER("Biology Teacher"),
    CHEMISTRYTEACHER("Chemistry Teacher"),
    MATHEMATICSTEACHER("Mathematics Teacher"),
    ENGLISHTEACHER("English Teacher"),
    DUTCHTEACHER("Dutch Teacher"),
    FRENCHTEACHER("French Teacher"),
    JANITOR("Janitor"),
    COOK("Cook"),
    DEAN("Dean"),
    FACULTYDEAN("Faculty Dean"),
    HR("H.R.");


    private String title;

    Jobs(String title) {
        this.title = title;
    }
}
