package homework8;

public class TriangleContainer {

    private Triangle[] equilateral;
    private Triangle[] isosceles;
    private Triangle[] rectangular;
    private Triangle[] arbitrary;


    public TriangleContainer(Triangle[] equilateral, Triangle[] isosceles, Triangle[] rectangular, Triangle[] arbitrary) {
        this.equilateral = equilateral;
        this.isosceles = isosceles;
        this.rectangular = rectangular;
        this.arbitrary = arbitrary;
    }

    public void getBiggestPerimeterForEach() {
        Triangle maxEq = equilateral[0];
        Triangle maxIso = isosceles[0];
        Triangle maxRec = rectangular[0];
        Triangle maxAr = arbitrary[0];
        for(int i = 0; i < equilateral.length; i++) {
            if (equilateral[i].findPerimeter() > maxEq.findPerimeter()){
                maxEq = equilateral[i];
            }
        }
        for(int i = 0; i < isosceles.length; i++) {
            if (isosceles[i].findPerimeter() > maxIso.findPerimeter()){
                maxIso = isosceles[i];
            }
        }
        for(int i = 0; i < rectangular.length; i++) {
            if (rectangular[i].findPerimeter() > maxRec.findPerimeter()){
                maxRec = rectangular[i];
            }
        }
        for(int i = 0; i < arbitrary.length; i++) {
            if (arbitrary[i].findPerimeter() > maxAr.findPerimeter()){
                maxAr = arbitrary[i];
            }
        }
        System.out.println(maxEq + "\n" + maxIso + "\n" + maxRec + "\n" + maxAr );
    }

    public void getBiggestAreaForEach() {
        Triangle maxEq = equilateral[0];
        Triangle maxIso = isosceles[0];
        Triangle maxRec = rectangular[0];
        Triangle maxAr = arbitrary[0];
        for(int i = 0; i < equilateral.length; i++) {
            if (equilateral[i].findArea() > maxEq.findArea()){
                maxEq = equilateral[i];
            }
        }
        for(int i = 0; i < isosceles.length; i++) {
            if (isosceles[i].findArea() > maxIso.findArea()){
                maxIso = isosceles[i];
            }
        }
        for(int i = 0; i < rectangular.length; i++) {
            if (rectangular[i].findArea() > maxRec.findArea()){
                maxRec = rectangular[i];
            }
        }
        for(int i = 0; i < arbitrary.length; i++) {
            if (arbitrary[i].findArea() > maxAr.findArea()){
                maxAr = arbitrary[i];
            }
        }
        System.out.println(maxEq + "\n" + maxIso + "\n" + maxRec + "\n" + maxAr );
    }

    public void getSmallestPerimeterForEach() {
        Triangle minEq = equilateral[0];
        Triangle minIso = isosceles[0];
        Triangle minRec = rectangular[0];
        Triangle minAr = arbitrary[0];
        for(int i = 0; i < equilateral.length; i++) {
            if (equilateral[i].findPerimeter() < minEq.findPerimeter()){
                minEq = equilateral[i];
            }
        }
        for(int i = 0; i < isosceles.length; i++) {
            if (isosceles[i].findPerimeter() < minIso.findPerimeter()){
                minIso = isosceles[i];
            }
        }
        for(int i = 0; i < rectangular.length; i++) {
            if (rectangular[i].findPerimeter() < minRec.findPerimeter()){
                minRec = rectangular[i];
            }
        }
        for(int i = 0; i < arbitrary.length; i++) {
            if (arbitrary[i].findPerimeter() < minAr.findPerimeter()){
                minAr = arbitrary[i];
            }
        }
        System.out.println(minEq + "\n" + minIso + "\n" + minRec + "\n" + minAr );
    }

    public void getSmallestAreaForEach() {
        Triangle minEq = equilateral[0];
        Triangle minIso = isosceles[0];
        Triangle minRec = rectangular[0];
        Triangle minAr = arbitrary[0];
        for(int i = 0; i < equilateral.length; i++) {
            if (equilateral[i].findArea() < minEq.findArea()){
                minEq = equilateral[i];
            }
        }
        for(int i = 0; i < isosceles.length; i++) {
            if (isosceles[i].findArea() < minIso.findArea()){
                minIso = isosceles[i];
            }
        }
        for(int i = 0; i < rectangular.length; i++) {
            if (rectangular[i].findArea() < minRec.findArea()){
                minRec = rectangular[i];
            }
        }
        for(int i = 0; i < arbitrary.length; i++) {
            if (arbitrary[i].findArea() < minAr.findArea()){
                minAr = arbitrary[i];
            }
        }
        System.out.println(minEq + "\n" + minIso + "\n" + minRec + "\n" + minAr );
    }

    @Override
    public String toString() {
        return "Equilateral: " + equilateral.length + " isosceles: " + isosceles.length + " rectangular: " + rectangular.length +
                " arbitrary: " + arbitrary.length;
    }
}

