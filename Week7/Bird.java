package Week7;
//632115029 Panadon Saikaew
public class Bird extends Pets {
    String country;
    public Bird(String name, int age, String species, String color) {
        this.age = age;
        this.name = name;
        this.species = species;
        this.color = color;
    }
    public void Speak() {
        System.out.println("Quackk!");
    }
    public void checkCountry() {
        System.out.println("The bird is from " + country);
        System.out.println("");
    }
    public void canFly() {
        System.out.println("Bird fly into the sky");
    }
}
