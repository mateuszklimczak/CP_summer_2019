package pl.waw.sgh.Shapes;

public abstract class Shape {   //abstract - i don't know any ne to create new shape in this class

    double parA;
    double parB;

    public Shape(double parA, double parB){
        setParams(parA, parB);
    }

    public Shape(double parA){
        setParams(parA, 0);
    }

    public void setParams(double parA, double parB){

        this.parA = parA;
        this.parB = parB;
    }


    public abstract double calcSurface();

    @Override
    public String toString(){
        return "Shape [parA=" + parA + " , ParB=" + parB + "]";
    }
}
