package pl.waw.sgh.shapes;

public class Triangle extends Shape implements PerimeterCalculation{

    private double parC;

    public Triangle(double a, double b) {
        super(a, b);
        this.parC = a+b -1;
    }

    public Triangle(double a, double b, double c){
        super(a,b);
        this.parC = c;
    }


    @Override
    public double calcPerimeter() {
        return this.parA + this.parB + this.parC;
    }

    @Override
    public double calcSurface() {
        return -1;
    }
}
