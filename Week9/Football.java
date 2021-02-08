public class Football extends Person {
    String Club;
    public Football(String Name,int BornYear,String Club) {
        super(Name,BornYear);
        this.Club = Club;
    }
    public void introduce() {
        super.introduce();
        System.out.println("I'm a sheriff working in: " + Club);
    }
}
