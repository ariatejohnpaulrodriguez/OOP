/*
 * package main;
 * 
 * public class classesANDobject {
 * 
 * public static void main(String[] args) {
 * 
 * Person p = new Person();
 * p.firstname = "John Paul";
 * p.lastname = "Ariate";
 * p.sex = 'M';
 * p.age = 24;
 * 
 * Person p1 = new Person();
 * p1.firstname = "Jepong";
 * p1.lastname = "Makaulit";
 * p1.sex = 'F';
 * p1.age = 25;
 * 
 * System.out.println(p.firstname);
 * System.out.println(p1.firstname);
 * 
 * }
 * }
 */

/*
 * package main;
 * 
 * import java.util.Scanner;
 * 
 * public class classesANDobject {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner s = new Scanner(System.in);
 * 
 * System.out.print("Firstname: ");
 * String firstname = s.nextLine();
 * 
 * System.out.print("Lastname: ");
 * String lastname = s.nextLine();
 * 
 * System.out.print("Sex: ");
 * String sex = s.nextLine();
 * 
 * System.out.print("Age: ");
 * int age = s.nextInt();
 * 
 * Person p1 = new Person(firstname, lastname, sex, age);
 * }
 * 
 * }
 */

package main;

public class classesANDobject {

    public static void main(String[] args) {

        student s = new student("Paul", "Ariate", "BS Computer Science", "TLC", 3, 90, 91);
        s.introduce();
    }

}
