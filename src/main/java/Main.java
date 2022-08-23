public class Main {
    public static void main(String[] args) {
        PrintShape a = new PrintShape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape rhombus = new Rhombus();
        Shape square = new Square();
        Shape triangle = new Triangle();
        a.print(circle);
        a.print(rectangle);
        a.print(rhombus);
        a.print(square);
        a.print(triangle);
    }
}

