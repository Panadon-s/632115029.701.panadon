package Week6;

public class Student extends Person {
    String subject;
    public Student(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void greet() {
        System.out.println(name + " is studying " + subject + " subject");
        System.out.println(" ");
    }
}
