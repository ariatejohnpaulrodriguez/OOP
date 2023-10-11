package main;

public class employee {

    public String firstname, lastname;
    public String title, address, sex;

    int age;

    employee(String firstname, String lastname, String title) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;

    }

    employee() {
        firstname = "N/A";
        lastname = "N/A";
        title = "N/A";
        address = "N/A";
        sex = "N/A";
        age = 0;
    }

    employee(String firstname,
            String lastname,
            String title,
            String address,
            String sex,
            int age) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

}
