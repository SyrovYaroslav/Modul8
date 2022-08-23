public class Main {
    public static void main(String[] args) {
        PrintShape a = new PrintShape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Rhombus rhombus = new Rhombus();
        Square square = new Square();
        Triangle triangle = new Triangle();
        a.print(circle);
        a.print(rectangle);
        a.print(rhombus);
        a.print(square);
        a.print(triangle);
    }
}

