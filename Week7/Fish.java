package Week7;
//632115029 Panadon Saikaew
public class Fish extends Pets {
    String speed;
    public Fish(String name, int age, String species, String color) {
        this.age = age;
        this.name = name;
        this.species = species;
        this.color = color;
    }  
    public void SwimSea() {
        System.out.println("Fish swim in to the sea");
    }
    public void SwimSpeed() {
        System.out.println("My fish can swim " + speed + " miles per hours");
        System.out.println("");
    }
}
