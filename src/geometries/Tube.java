package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

public class Tube extends Geometry
{
    final Ray axisRay;
    final double radius;

    public Tube(Ray axisRay, double radius) {
        this.axisRay = axisRay;
        this.radius = radius;
    }

    public Ray getAxis() {
        return axisRay;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "axisRay=" + axisRay +
                ", radius=" + radius +
                '}';
    }

    /**
     * calculates normal for infinite cylinder(tube)
     * @param point
     * @return
     */
    @Override
    public Vector getNormal(Point point) {
        double t = axisRay.getDir().dotProduct(point.subtract( axisRay.getP0()));//finding scaler for the projection of point on axisRay
        Point O = axisRay.getP0().add(axisRay.getDir().scale(t));// O is the projection of point on axisRay
        Vector N=point.subtract(O);
        return N.normalize();
    }

    @Override
    public List<GeoPoint> findGeoIntersectionsHelper(Ray ray) {
        return null;
    }
}

