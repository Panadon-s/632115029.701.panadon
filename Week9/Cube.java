public class Cube extends Shape {
    private int Length;

    public Cube(int Width,int Height,int Length) {
        super(Width,Height);
        this.Length = Length;
    }
    public String toString() {
        return "This is a cube with the side of " + Length;
    }
}
