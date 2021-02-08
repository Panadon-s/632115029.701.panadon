public class Rectangle extends Shape {
    private int Width;
    private int Height;

    public Rectangle(int Width,int Height) {
        this.Width = Width;
        this.Height = Height;
    }
    public String toString() {
        return "This Rectangle Width is " + Width + " and Height is " + Height;
    }
}
