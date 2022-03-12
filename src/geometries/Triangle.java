package geometries;

public class Triangle extends Polygon
{
    Triangle(Point p1, Point p2, Point p3)
    {
        super(p1, p2, p3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertices=" + vertices +
                ", plane=" + plane +
                '}';
    }
}
