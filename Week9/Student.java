public class Student {
    private String FirstName = "Hello";
    private String LastName = "World";

    public Student (String FirstName,String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public String toString() {
        return "My first name is: " + FirstName + " and my last name is: " + LastName;
    }
    public static void main(String[] args) {
        Student p = new Student("Hello","World");
        System.out.println(p.toString());
    }
}