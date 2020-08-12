package com.hillel.homework9.triangleHomework.models;

import com.hillel.homework9.triangleHomework.utils.*;

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
        return sideAB() + sideBC() + sideAC();
    }

    @Override
    public double findArea() {
        double halfPerimeter = findPerimeter()/2;;
        return Math.sqrt(halfPerimeter*(halfPerimeter - sideAB())*(halfPerimeter - sideAC())*(halfPerimeter - sideBC()));
    }

    public double sideAB() {
        return FigureUtils.calcSideLength(a,b);
    }

    public double sideBC() {
        return FigureUtils.calcSideLength(b,c);
    }

    public double sideAC() {
        return FigureUtils.calcSideLength(a,c);
    }

    public boolean isEquilateral() {
        return sideAB() == sideAC() && sideAC() == sideBC();
    }

    public boolean isIsosceles() {
        return sideAB() == sideAC() || sideAC() == sideBC() || sideAB() == sideBC();
    }

    public boolean isRectangular() {
        return sideAB()*sideAB() == sideAC()*sideAC() + sideBC()*sideBC()
                || sideAC()*sideAC() == sideAB()*sideAB() + sideBC()*sideBC()
                || sideBC()*sideBC() == sideAC()*sideAC() + sideAB()*sideAB();
    }

    public boolean isArbitrary() {
        return !isEquilateral() && !isIsosceles() && isRectangular();
    }

    @Override
    public String toString() {
        return a + " " + b + " " + c + " Perimeter: " + findPerimeter() + " Area: " + findArea();
    }
}
