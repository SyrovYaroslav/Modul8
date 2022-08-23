public class Main {
    public static void main(String[] args) {
        PrintShape a = new PrintShape();
        System.out.println(a.circle.printName());
        System.out.println(a.rectangle.printName());
        System.out.println(a.rhombus.printName());
        System.out.println(a.square.printName());
        System.out.println(a.triangle.printName());
    }
}

