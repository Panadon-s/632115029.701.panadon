package Week7;
//632115029 Panadon Saikaew
public class Dog extends Pets {
    String hair;
    public Dog(String name, int age, String species, String color) {
        this.age = age;
        this.name = name;
        this.species = species;
        this.color = color;
    }
    public void Bark() {
        System.out.println("Woof Woof!");
    }
    public void Run() {
        System.out.println("My dog run so fast");
    }
    public void ShortHair() {
        System.out.println("my dog is " + hair);
        System.out.println("");
    }
}
