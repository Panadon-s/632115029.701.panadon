package Week6;

public class Actor extends Person {
    String movie;
    public Actor(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void interview() {
        System.out.println(name + " is starring " + movie + " movies");
        System.out.println(" ");
    }
}
