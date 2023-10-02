package main;

public class student {

    String firstname, lastname, course, section;
    int year, midtermGrade, finalgrade;

    student(String firstame, String lastname, String course, String section, int year, int midtermGrade,
            int finalgrade) {

        this.firstname = firstame;
        this.lastname = lastname;
        this.course = course;
        this.section = section;
        this.year = year;
        this.midtermGrade = midtermGrade;
        this.finalgrade = finalgrade;

    }

    public void introduce() {

        System.out.println("I'am " + firstname);
    }

}
