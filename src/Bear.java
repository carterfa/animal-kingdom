import java.awt.*;

public class Bear extends Critter{

    private final boolean polar;
    private String bearSymbol = "/";

    public Bear(boolean polar){
        super();
        this.polar = polar;
    }

    public Color getColor() {
        if (this.polar){
            return Color.WHITE;
        }else {
            return Color.BLACK;
        }
    }

    public String toString() {
        if (this.bearSymbol.equals("/")) {
            this.bearSymbol = "\\";
        }else{
            this.bearSymbol = "/";
        }
        return bearSymbol;
    }

    public Action getMove(CritterInfo info) {

        if (info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }else if (info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }else {
            return Action.LEFT;
        }
    }
}

