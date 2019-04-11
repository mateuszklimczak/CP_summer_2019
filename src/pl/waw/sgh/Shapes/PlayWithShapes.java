package pl.waw.sgh.Shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
   /*     Shape s1 = new Shape(5);
        System.out.println(s1.toString());*/

        Rectangle r1 = new Rectangle(3,8);
        System.out.println("Rectangle: " + r1);
        System.out.println("Rectangle = " + r1.calcSurface());

        Cricle c1 = new Cricle(10);
        System.out.println("Circle: " + c1);
        System.out.println("Circle = " + c1.calcSurface());

        Square sq1 = new Square(5);
        System.out.println("Square: " + sq1);
        System.out.println("Square = " + sq1.calcSurface());

        Shape s1 = r1;

        //s1.calcSurface()
       // Rectangle r2 = s1;
        System.out.println();
        Rectangle r3 = r1;


        Shape[] myShapes = new Shape[3];
        myShapes[0] = r1;
        myShapes[1] = c1;
        myShapes[2] = new Rectangle (2, 9);

        for(Shape s : myShapes){

            System.out.println(s);
            System.out.println(s.calcSurface());
        }
    }
}
