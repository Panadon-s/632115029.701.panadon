package Week6;

public class Streamer extends Person {
    String games;
    public Streamer(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void stream() {
        System.out.println(name + " is streaming " + games);
        System.out.println(" ");
    }
}
