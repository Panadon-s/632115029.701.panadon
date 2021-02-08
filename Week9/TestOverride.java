public class TestOverride {
    public static void main(String[] args) {
        System.out.println("        ---        ");
        Person person1 = new Person("Panadon",2001);
        person1.introduce();
        System.out.println("        ---        ");

        Sheriff person2 = new Sheriff("Mateo",1988,"California");
        person2.introduce();
        System.out.println("        ---        ");

        Teacher person3 = new Teacher("Ball",1977,"CMU");
        person3.introduce();
        System.out.println("        ---        ");

        PrimeMinister person4 = new PrimeMinister("Tu",1954,"Thailand");
        person4.introduce();
        System.out.println("        ---        ");

        Football person5 = new Football("Messi",1987,"Barcelona");
        person5.introduce();
        System.out.println("        ---        ");

        Witcher person6 = new Witcher("Geralt",1168,"Wolf");
        person6.introduce();
        System.out.println("        ---        ");

        Shape shape1 = new Shape();
        System.out.println(shape1.toString());
        System.out.println("        ---        ");

        Rectangle shape2 = new Rectangle(10,50);
        System.out.println(shape2.toString());
        System.out.println("        ---        ");

        Cube shape3 = new Cube(10,50,25);
        System.out.println(shape3.toString());
        System.out.println("        ---        ");

    }
}
