package E17;

import java.awt.Point;

public class LabeledPoint {
    private Point location;
    private String label;

    public LabeledPoint(Point location, String label) {
        this.location = location;
        this.label = label;
    }

    public Point getLocation() {
        return location;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "location=" + location +
                ", label='" + label + '\'' +
                '}';
    }
}
