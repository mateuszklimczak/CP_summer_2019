package pl.waw.sgh.Shapes;

public  class Triangle extends Shape {
    public Triangle(double parA, double parH) {
        super(parA, parH);
    }

    public double calcSurface() {
        return 0.5*parA*parH;
    }


}

