
public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.printName();
        Shape rectangle = new Rectangle();
        rectangle.printName();
        Shape circle = new Circle();
        circle.printName();
        Shape rhombus = new Rhombus();
        rhombus.printName();
        Shape square = new Square();
        square.printName();
    }
}

abstract class Shape {
    public abstract void printName();
}

class Triangle extends Shape {
    @Override
    public void printName() {
        System.out.println("трикутник");
    }
}

class Rectangle extends Shape {
    @Override
    public void printName() {
        System.out.println("прямокутник");
    }
}

class Circle extends Shape {
    @Override
    public void printName() {
        System.out.println("коло");
    }
}

class Rhombus extends Shape {
    @Override
    public void printName() {
        System.out.println("ромб");
    }
}

class Square extends Shape {
    @Override
    public void printName() {
        System.out.println("квадрат");
    }
}