package homework8;

public class Triangle extends Figure {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double findPerimeter() {
        return (calcSideLength(a, b) + calcSideLength(b, c) + calcSideLength(a, c));
    }

    @Override
    public double findArea() {
        double halfPerimeter = findPerimeter()/2;
        double ab = calcSideLength(a,b);
        double ac = calcSideLength(a,c);
        double bc = calcSideLength(b,c);
        return Math.sqrt(halfPerimeter*(halfPerimeter - ab)*(halfPerimeter - ac)*(halfPerimeter - bc));
    }

    /*
    if equilateral return 1;
    if isosceles return 2;
    if rectangular return 3;
    if arbitrary return 4;
     */
    public int getType() {
        double ab = calcSideLength(a,b);
        double ac = calcSideLength(a,c);
        double bc = calcSideLength(b,c);
        if (ab == ac && ac == bc)
            return 1;
        if (ab == ac || ac == bc || ab == bc)
            return 2;
        if (ab*ab == ac*ac + bc*bc || ac*ac == ab*ab + bc*bc || bc*bc == ac*ac + ab*ab)
            return 3;
        else return 4;
    }

    private double calcSideLength(Point p1, Point p2) {
        double sideLength;
        sideLength = Math.sqrt((Math.pow(Math.abs(p2.getX()) - Math.abs(p1.getX()), 2) +
                Math.pow(Math.abs(p2.getY()) - Math.abs(p1.getY()), 2)));
        return sideLength;
    }

    @Override
    public String toString() {
        return a + " " + b + " " + c + " Perimeter: " + findPerimeter() + " Area: " + findArea();
    }
}
