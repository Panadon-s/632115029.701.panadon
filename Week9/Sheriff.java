public class Sheriff extends Person {
    String WorkState;
    public Sheriff(String Name,int BornYear,String WorkState) {
        super(Name,BornYear);
        this.WorkState = WorkState;
    }
    public void introduce() {
        super.introduce();
        System.out.println("I'm a sheriff working in: " + WorkState);
    }
}
