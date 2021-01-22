package Week7;
//632115029 Panadon Saikaew
public class Pets {
    String name;
    int age;
    String species;
    String color;
    public Pets() {

    }
    public Pets(String name, int age, String color, String species) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
    }
    public void showData() {
        System.out.println("Pet name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years old");
        System.out.println("Color: " + color);
        
    }
}
