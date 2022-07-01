package hust.ict.globalict.project.force;

import hust.ict.globalict.project.utils.Direction;
import hust.ict.globalict.project.object.MainObject;

public class Force {
    private double strength;
    private	Direction direction;
    private MainObject obj;

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public MainObject getObj() {
        return obj;
    }

    public void setObj(MainObject obj) {
        this.obj = obj;
    }

}