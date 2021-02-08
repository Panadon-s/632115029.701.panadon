public class Teacher extends Person {
    String WorkPlace;
    public Teacher(String Name,int BornYear,String WorkPlace) {
        super(Name,BornYear);
        this.WorkPlace = WorkPlace;
    }
    public void introduce() {
        super.introduce();
        System.out.println("I’m a teacher and teach the students in: " + WorkPlace);
    }
}
