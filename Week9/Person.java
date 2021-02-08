public class Person {
    private String Name;
    private int BornYear;

    public Person (String Name,int BornYear) {
        this.Name = Name;
        this.BornYear = BornYear;
    }
    public void introduce() {
        System.out.println("My name is: " + Name);
        System.out.println("I born at: " + BornYear);
    }
}
