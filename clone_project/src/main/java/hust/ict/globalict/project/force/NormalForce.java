package hust.ict.globalict.project.force;
import hust.ict.globalict.project.force.Gravitation;
import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Direction;

public class NormalForce extends Force{

    public NormalForce(MainObject obj) {
    this.setObj(obj);
    this.setStrength(obj.getMass()*10);
    this.setDirection(Direction.UP);
    }

}