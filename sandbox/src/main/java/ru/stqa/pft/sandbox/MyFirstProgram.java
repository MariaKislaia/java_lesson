package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Maria");

        Square s = new Square(5) ;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area() );

        Rectangle r = new Rectangle(4, 6) ;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area() );

        Triangle t = new Triangle(8);
        System.out.println("Площадь треугольника со стороной " + t.l + " = " + t.area() );

        Square1 n = new Square1(4);
        System.out.println("Периметр квадрата со стороной " + n.l + " = " + n.perimeter() );
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
}
