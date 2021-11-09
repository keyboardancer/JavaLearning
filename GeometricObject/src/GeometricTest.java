public class GeometricTest {

    public static void main(String[] args) {

        GeometricTest geometricTest = new GeometricTest();
        //两个圆的面积显示和比较
        Circle c1 = new Circle("yellow", 2,2);
        geometricTest.displayGeometricObject(c1);
        Circle c2 = new Circle("yellow", 2,4);
        geometricTest.displayGeometricObject(c2);
        boolean isEqual_C = geometricTest.equalsArea(c1, c2);
        System.out.println("面积是否相等(T/F): " + isEqual_C);

        //两个矩形的面积显示和比较
        MyRectangle m1 = new MyRectangle("red", 3.3, 4.4, 5.5);
        geometricTest.displayGeometricObject(m1);
        MyRectangle m2 = new MyRectangle("red", 3.3, 4.4, 5.5);
        geometricTest.displayGeometricObject(m2);
        boolean isEqual_M = geometricTest.equalsArea(m1, m2);
        System.out.println("面积是否相等(T/F): " + isEqual_M);
    }

    public boolean equalsArea(GeometricObject a, GeometricObject b) {
        return a.findArea() == b.findArea();
    }

    public void displayGeometricObject(GeometricObject area) {
        if (area instanceof Circle) {
            double circleArea = ((Circle) area).findArea();
            System.out.println("圆的面积是: " + circleArea);
        } else if (area instanceof MyRectangle) {
            double MytangleArea = ((MyRectangle) area).findArea();
            System.out.println("矩形的面积是: " + MytangleArea);
        }
    }

}

