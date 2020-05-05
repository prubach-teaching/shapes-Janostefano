package pl.waw.sgh.shapes;



public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public double calcSurface() {
        return Math.pow(this.parA, 2);
    }

    @Override
    public double calcPerimeter() {
        return this.parA*4;
    }
}
