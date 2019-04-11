package pl.waw.sgh.Shapes;

public class Rectangle extends Shape {


    public Rectangle(double parA, double parB) {
        super(parA, parB);
    }

    public double calcSurface(){
        return parA*parB;
    }
}
