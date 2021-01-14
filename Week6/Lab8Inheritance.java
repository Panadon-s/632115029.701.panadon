package Week6;

public class Lab8Inheritance {
    public static void main(String[] args) {
        Artist art = new Artist("Timothy", 19, "Male");
        Student student = new Student("Hudson", 19, "Male");
        Teacher teacher = new Teacher("Professor Edward", 40, "Male");
        Actor actor = new Actor("James", 18, "Male");
        Zookeeper zookeeper = new Zookeeper("Hoffman", 30, "Male");
        Streamer streamer = new Streamer("Belle", 21, "Female");

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();
        
        student.subject = "programming";
        student.introduce();
        student.greet();

        teacher.Tsubject = "Object Oriented";
        teacher.introduce();
        teacher.says();

        actor.movie = "Action";
        actor.introduce();
        actor.interview();
        
        zookeeper.animal = "Giraffe";
        zookeeper.introduce();
        zookeeper.care();

        streamer.games = "League of Legends";
        streamer.introduce();
        streamer.stream();
    }
}
