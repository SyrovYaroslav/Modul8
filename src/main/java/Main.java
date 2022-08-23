public class Main {
    public static void main(String[] args) {
        PrintShape printShape = new PrintShape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape rhombus = new Rhombus();
        Shape square = new Square();
        Shape triangle = new Triangle();
        printShape.print(circle);
        printShape.print(rectangle);
        printShape.print(rhombus);
        printShape.print(square);
        printShape.print(triangle);
    }
}

