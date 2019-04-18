package pl.waw.sgh.Shapes;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle (double parA, double parH) {
        super(parA, parH);
    }

    public double calcSurface() {
        return (Math.pow(parA,2)*Math.sqrt(3))/4;
    }
}
