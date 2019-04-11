package pl.waw.sgh.Shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
        Shape s1 = new Shape(5);
        System.out.println(s1.toString());

        Rectangle r1 = new Rectangle(3,8);
        System.out.println("Rectangle: " + r1);
        System.out.println("Rectangle = " + r1.calcSurface());

        Cricle c1 = new Cricle(3);
        System.out.println("Circle: " + c1);
        System.out.println("Circle = " + c1.calcSurface());

        Square sq1 = new Square(5);
        System.out.println("Square: " + sq1);
        System.out.println("Square = " + sq1.calcSurface());

    }
}
