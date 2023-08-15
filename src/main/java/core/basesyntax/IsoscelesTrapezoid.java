package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double lowSide;
    private double height;

    public IsoscelesTrapezoid(String color, double topSide, double lowSide, double height) {
        super(color);
        this.topSide = topSide;
        this.lowSide = lowSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topSide + lowSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + this.getArea()
                + " sq.units, leg1: " + this.topSide
                + " units, leg2: " + this.lowSide
                + " units, height: " + this.height
                + " units, color: " + this.color);
    }
}
