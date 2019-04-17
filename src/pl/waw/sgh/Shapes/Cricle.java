package pl.waw.sgh.Shapes;

public class Cricle extends Shape {

    public Cricle(double parA) {
        super(parA, parA);
    }

    public double calcSurface(){
        return Math.PI*parA*parA;
        //return Math.PI*Math.pow(parA, 2);
    }
}
