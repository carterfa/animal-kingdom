import java.awt.*;

public class WhiteTiger extends Tiger{

    private boolean infected = false;

    public WhiteTiger() {
        super();
        this.infected = infected;
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        if(infected){
            return "TGR";
        }else{
            return "tgr";
        }
    }

    public Critter.Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            this.infected = true;
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
