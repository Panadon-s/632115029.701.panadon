package Week7;
//632115029 Panadon Saikaew
public class Simulate {
    public static void main (String[] args) {
        Bicycle bicycle1 = new NormalBike();

        bicycle1.speed = 0;
        bicycle1.Speed();
        bicycle1.Speed();
        bicycle1.Brake();

        Bicycle bicycle2 = new MountainBike();
        bicycle2.speed = 0;
        bicycle2.Speed();
        bicycle2.Gear();
        bicycle2.Speed();
        bicycle2.Brake();
    }
}
