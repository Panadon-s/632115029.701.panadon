package Week7;
//632115029 Panadon
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Pizza",5,"Poodle","Brown");
        Bird bird = new Bird("SunShine",1,"Cockatiel","White");
        Fish fish = new Fish("Lennon",2,"Rainbow Trout","Rainbow");

        dog.hair = "ShortHair";
        dog.showData();
        dog.Bark();
        dog.Run();
        dog.ShortHair();

        bird.country = "Australia";
        bird.showData();
        bird.Speak();
        bird.canFly();
        bird.checkCountry();

        fish.speed = "50";
        fish.showData();
        fish.SwimSea();
        fish.SwimSpeed();
    }
    
}