public class testClass {
    public static void main(String[] args) {
        Circle c1 = new Circle("blue", 2.0, 3.0);
        Circle c2 = new Circle("red", 3.0, 5.0);

        //判断c1和c2颜色是否相等
        if (c1.color.equals(c2.color)) {
            System.out.println("c1和c2颜色相等");
        } else {
            System.out.println("c1和c2颜色不等");
        }

        //判断c1和c2半径是否相等
        if (c1.equals(c2)) {
            System.out.println("c1和c2半径相等");
        } else {
            System.out.println("c1和c2半径不等");
        }

        //输出半径
        System.out.println("c1的半径: " + c1.toString());
        System.out.println("c2的半径: " + c2.toString());



    }
}
