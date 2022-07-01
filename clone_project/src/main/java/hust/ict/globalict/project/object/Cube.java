package hust.ict.globalict.project.object;

import hust.ict.globalict.project.utils.Shape;

public class Cube extends MainObject{

    private double sideLength;

    public Cube(Shape shape) {
        super(shape);
    }

    public void calAcceleration() {

    }

    public void calVelocity() {

    }

    public double getRadius() {
        return sideLength;
    }

    public void setRadius(double sideLength) {
        this.sideLength = sideLength;
    }
}