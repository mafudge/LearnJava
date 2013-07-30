package circleclass;

/**
 *
 * This class implements a Circle. Here are the methods
 * 
 *  Circle()            => constructor, new circle of radius 0
 *  Circle(r)           => new circle of radius r
 *  getRadius()         => return the radius property
 *  setRadius(r)        => set the radius property
 *  area()              => calculates the area
 *  circ()              => calculates the circumference 
 */
public class Circle {

    private double _radius;

    public Circle() {
        _radius = 0;
    }
    
    public Circle(double r) {
        // TODO: 
        this._radius = r;
    }
    
    public double getRadius() {
        // TODO: insert code here to return radius
        return _radius;
    }
    
    public double setRadius(double r) {
        // TODO: insert code here to set radius
        return (_radius = r);
    }
    
    public double area() {
        // TODO: insert code here to return area
        return Math.PI*_radius*_radius;
    }
    
    public double circ() {
        // TODO: insert code here to return circumference
        return Math.PI*_radius*2;
    }
       
}
