import java.awt.*;

public class Tiger extends Critter {

    private int colorCount = 1;
    private Color currentColor = Color.RED;

    public Tiger() {
        super();
    }

    public Color getColor() {
        int rand = (int) (Math.random() * 3);
        colorCount--;
        if (colorCount == 0) {
            if (rand == 0) {
                this.currentColor = Color.RED;
            } else if (rand == 1) {
                this.currentColor = Color.BLUE;
            } else {
                this.currentColor = Color.GREEN;
            }
            colorCount = 3;
        }

        return this.currentColor;
    }

    public String toString() {
        return "TGR";
    }

    public Critter.Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
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
