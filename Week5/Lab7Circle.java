package Week5;

public class Lab7Circle {
    public static void main (String[] args){
        Circle circle1 = new Circle(0.0,0.0,2.0);
        circle1.getCircle();
        Circle circle2 = new Circle(1.0,2.0,3.0);
        circle2.getCircle();
        Circle circle3 = new Circle(3.0,5.0,1.0);
        circle3.getCircle();
        Circle circle4 = new Circle(-1.0,-10.0,-1.0);
        circle4.getCircle();

        System.out.println("Are objects from the test case 1 and test case 2 intersected: " + Circle.getIntersec(circle1, circle2));
        System.out.println("Are objects from the test case 1 and test case 3 intersected: " + Circle.getIntersec(circle1, circle3));
    }
}