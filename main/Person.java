package main;

public class Person {

    String firstname;
    String lastname;
    String sex;
    int age;

    Person(String firstname, String lastname, String sex, int age) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;

        System.out.println(firstname + lastname + sex + age + " Success!");

    }

}