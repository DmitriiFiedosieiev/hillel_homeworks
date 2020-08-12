package com.hillel.homework9.triangleHomework.triangleProcesses;

import com.hillel.homework9.triangleHomework.implOfTriangleFunctions.implOfCryteria.Arbitrary;
import com.hillel.homework9.triangleHomework.implOfTriangleFunctions.implOfCryteria.Equilateral;
import com.hillel.homework9.triangleHomework.implOfTriangleFunctions.implOfCryteria.Isosceles;
import com.hillel.homework9.triangleHomework.implOfTriangleFunctions.implOfCryteria.Rectangular;
import com.hillel.homework9.triangleHomework.implOfTriangleFunctions.implOfValue.Perimeter;
import com.hillel.homework9.triangleHomework.models.Triangle;
import com.hillel.homework9.triangleHomework.triangleFunctions.Cryteria;
import com.hillel.homework9.triangleHomework.triangleFunctions.Value;

public class TriangleProcessor {

    private Triangle[] triangles;
    Cryteria cryteria;
    Value value;

    public TriangleProcessor(Triangle[] triangles) {
        this.triangles = triangles;
    }

    public int countEquilateral() {
        cryteria = new Equilateral();
        return countByType(cryteria);
    }

    public int countIsosceles() {
        cryteria = new Isosceles();
        return countByType(cryteria);
    }

    public int countRectangular() {
        cryteria = new Rectangular();
        return countByType(cryteria);
    }

    public int countArbitrary() {
        cryteria = new Arbitrary();
        return countByType(cryteria);
    }

    public Triangle showBiggestPerimeterOfEquilateral() {
        cryteria = new Equilateral();
        value = new Perimeter();
        return findBiggest(cryteria,value);
    }

    public Triangle showBiggestPerimeterOfIsosceles() {
        cryteria = new Isosceles();
        value = new Perimeter();
        return findBiggest(cryteria,value);
    }

    public Triangle showBiggestPerimeterOfRectangular() {
        cryteria = new Rectangular();
        value = new Perimeter();
        return findBiggest(cryteria,value);
    }


    //ETC



    private int countByType(Cryteria cryteria) {
        int count = 0;
        for (int i = 0; i < triangles.length; i++) {
           if(cryteria.check(triangles[i]))
               count++;
        }
        return count;
    }

    private Triangle findSmallest(Cryteria cryteria, Value value) {
        Triangle result = triangles[0];
        for(int i = 0; i < triangles.length; i++){
            if (cryteria.check(triangles[i]) && value.getValue(triangles[i]) < value.getValue(result)) {
                result = triangles[i];
            }
        }
        return result;
    }

    private Triangle findBiggest(Cryteria cryteria, Value value) {
        Triangle result = triangles[0];
        for(int i = 0; i < triangles.length; i++){
            if (cryteria.check(triangles[i]) && value.getValue(triangles[i]) > value.getValue(result)) {
                result = triangles[i];
            }
        }
        return result;
    }
}
