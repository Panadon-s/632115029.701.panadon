package Week6;
//Panadon Saikaew 632115029
public class Person {
    String name;
    int age;
    String gender;
    public Person() {

    }
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void introduce() {
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old");
        System.out.println("I'm a " + gender);
    }
}
