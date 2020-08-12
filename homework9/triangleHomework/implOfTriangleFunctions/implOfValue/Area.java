package com.hillel.homework9.triangleHomework.implOfTriangleFunctions.implOfValue;

import com.hillel.homework9.triangleHomework.models.Triangle;
import com.hillel.homework9.triangleHomework.triangleFunctions.Value;

public class Area implements Value {

    @Override
    public double getValue(Triangle triangle) {
        return triangle.findArea();
    }
}
