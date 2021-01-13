package Week5;

//632115029 Panadon
public class Circle {
    private double area;
    private double radius;
    double x;
    double y;

    public Circle() {

    }
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void getCircle() {
        if(radius<0) {
            System.out.println("The area of circle is: 0");
            System.out.println("The circumference is: 0");
        }else{
        area = Math.PI * radius * radius;
        System.out.println("The area of circle is: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("The circumference is: " + circumference);
        }
    }
    public static boolean getIntersec(Circle circle1,Circle circle2){
        double dis = 0;
        dis = (circle1.x-circle2.x) * (circle1.x-circle2.x) + (circle1.y-circle2.y) * (circle1.y-circle2.y);
        double sum = 0;
        sum = (circle1.radius+circle2.radius) * (circle1.radius+circle2.radius);

        if(dis>sum) {
            return false;
        }else{
            return true;
        }
    }
}
