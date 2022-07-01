package hust.ict.globalict.project.object;

import hust.ict.globalict.project.utils.Shape;

public class Cylinder extends MainObject{

    private double radius;

    public Cylinder(Shape shape) {
        super(shape);
    }

    public void calAngularAcceleration() {

    }

    public void calAngularVelocity() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}