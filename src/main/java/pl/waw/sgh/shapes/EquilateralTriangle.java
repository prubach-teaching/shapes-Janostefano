package pl.waw.sgh.shapes;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(double a) {
        super(a, a, a);
    }

    @Override
    public double calcPerimeter() {
        return super.calcPerimeter();
    }

    @Override
    public double calcSurface() {
        return (Math.pow(this.parA,2)*Math.pow(3, 1.0/2.0))/2;
    }
}
