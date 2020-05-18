import java.awt.*;

public class WhiteTiger extends Tiger{

    private boolean infected = false;

    public WhiteTiger() {
        super();
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

        if (super.getMove(info) == Action.INFECT){
            this.infected = true;
        }

        return super.getMove(info);
    }
}
