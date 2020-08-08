package homework8;

public class TriangleProcessor {
    private Triangle[] equilateral = new Triangle[0];
    private Triangle[] isosceles = new Triangle[0];
    private Triangle[] rectangular = new Triangle[0];
    private Triangle[] arbitrary = new Triangle[0];

    public TriangleContainer sortByTypes(Triangle[] triangles) {
        for (int i = 0; i < triangles.length; i++) {
            switch (triangles[i].getType()){
                case 1:
                    equilateral = increaseArray(equilateral);
                    equilateral[equilateral.length - 1] = triangles[i];break;
                case 2:
                    isosceles = increaseArray(isosceles);
                    isosceles[isosceles.length - 1] = triangles[i];break;
                case 3:
                    rectangular = increaseArray(rectangular);
                    rectangular[rectangular.length - 1] = triangles[i];break;
                case 4:
                    arbitrary = increaseArray(arbitrary);
                    arbitrary[arbitrary.length - 1] = triangles[i];break;
            }
        } return new TriangleContainer(equilateral,isosceles,rectangular,arbitrary);
    }

    private Triangle[] increaseArray(Triangle[] triangles) {
        Triangle[] tempArray = new Triangle[triangles.length + 1];
        for (int i = 0; i < triangles.length; i++) {
            tempArray[i] = triangles[i];
        } return tempArray;
    }
}
