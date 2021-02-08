public class Witcher extends Person {
    String School;
    public Witcher(String Name,int BornYear,String School) {
        super(Name,BornYear);
        this.School = School;
    }
    public void introduce() {
        super.introduce();
        System.out.println("I'm a witcher and my school is: " + School);
    }
}
