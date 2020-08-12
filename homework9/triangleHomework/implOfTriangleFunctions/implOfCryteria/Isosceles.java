package com.hillel.homework9.triangleHomework.implOfTriangleFunctions.implOfCryteria;

import com.hillel.homework9.triangleHomework.models.Triangle;
import com.hillel.homework9.triangleHomework.triangleFunctions.Cryteria;

public class Isosceles implements Cryteria {

    @Override
    public boolean check(Triangle triangle) {
        return triangle.isIsosceles();
    }
}
