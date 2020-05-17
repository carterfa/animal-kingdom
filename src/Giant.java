import java.awt.*;

public class Giant extends Critter {

    private String currentStr = "fee";
    private int strCount = 6;

    public Giant(){
        super();
        this.currentStr = currentStr;
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        strCount--;
        if (strCount <= 0) {
            if (currentStr.equals("fum")) {
                this.currentStr = "fee";
            }else if (currentStr.equals("foe")){
                this.currentStr = "fum";
            }else if (currentStr.equals("fie")){
                this.currentStr = "foe";
            }else{
                this.currentStr = "fie";
            }
            strCount = 6;
        }
        return currentStr;
    }

    public Critter.Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }else if (info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }else {
            return Action.RIGHT;
        }
    }
}
