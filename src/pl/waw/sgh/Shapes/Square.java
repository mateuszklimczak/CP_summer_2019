package pl.waw.sgh.Shapes;

public class Square extends Shape {

    public Square(double parA){
        super(parA, parA);
    }

    public double calcSurface(){
        return parA*parA;
    }


}
