package Week6;

public class Teacher extends Person{
    String Tsubject;
    public Teacher(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void says() {
        System.out.println(name + " is teaching " + Tsubject + " subject");
        System.out.println(" ");
    }
}
