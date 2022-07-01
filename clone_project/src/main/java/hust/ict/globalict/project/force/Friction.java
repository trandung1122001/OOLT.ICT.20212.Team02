package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.surface.Surface;
import hust.ict.globalict.project.utils.Direction;
import hust.ict.globalict.project.utils.Shape;

public class Friction extends Force{
    private Surface sf;
    private Force appliedForce;
    private Force normalForce;


    public Friction(Surface sf, MainObject obj, Force normalF, Force appliedF) {
        this.setSf(sf);
        this.setObj(obj);
        this.setNormalForce(normalF);
        this.setAppliedForce(appliedF);
    }
    public void calFriction() {
        if (this.getObj().getShape() == Shape.Cube) {
            if (appliedForce.getStrength() <=normalForce.getStrength()* sf.getStaticCoefficient()) {
                this.setStrength(appliedForce.getStrength());
                if(appliedForce.getDirection()== Direction.LEFT) this.setDirection(Direction.RIGHT);
                else this.setDirection(Direction.LEFT);
            }
            else {
                this.setStrength(normalForce.getStrength()* sf.getKineticCoefficient());
                if(appliedForce.getDirection()== Direction.LEFT) this.setDirection(Direction.RIGHT);
                else this.setDirection(Direction.LEFT);
            }
        }
        else {
            if (appliedForce.getStrength() <= 3*normalForce.getStrength()* sf.getStaticCoefficient()) {
                this.setStrength(appliedForce.getStrength()/3);
                if(appliedForce.getDirection()== Direction.LEFT) this.setDirection(Direction.RIGHT);
                else this.setDirection(Direction.LEFT);
            }
            else {
                this.setStrength(normalForce.getStrength()* sf.getKineticCoefficient());
                if(appliedForce.getDirection()== Direction.LEFT) this.setDirection(Direction.RIGHT);
                else this.setDirection(Direction.LEFT);
            }
        }
    }

    public Surface getSf() {
        return sf;
    }

    public void setSf(Surface sf) {
        this.sf = sf;
    }

    public void setNormalForce(Force normalForce) {
        this.normalForce = normalForce;
    }

    public void setAppliedForce(Force appliedForce) {
        this.appliedForce = appliedForce;
    }

}