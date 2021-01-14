package Week6;

public class Zookeeper extends Person {
    String animal;
    public Zookeeper(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void care() {
        System.out.println(name + " is taking care of " + animal);
        System.out.println(" ");
    }
}
