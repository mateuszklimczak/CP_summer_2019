package pl.waw.sgh.Shapes;

public abstract class Shape {   //abstract - i don't know any ne to create new shape in this class

    double parA;
    double parB;
    double parH;

    public Shape(double parA, double parB, double parH){
        setParams(parA, parB, parH);
    }

    public Shape(double a, double parA){
        setParams(parA, 0, parH);
    }

    public void setParams(double parA, double parB, double parH){

        this.parA = parA;
        this.parB = parB;

    }


    public abstract double calcSurface();

    @Override
    public String toString(){
        return "Shape [parA=" + parA + " , ParB=" + parB + "parH=" + parH + "]";
    }
}
