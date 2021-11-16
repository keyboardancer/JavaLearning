/*
* 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级
* 提示: 数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度，而向量类java.util.Vector可以根据需要动态伸缩
* 创建Vector对象：Vector v = new Vector();
* 给向量添加元素: v.addElement(Object obj);    //obj必须是对象
* 取出向量种的元素，Object obj = v.elementAt(0);
*   注意：第一个元素的下标是0，返回值是Object类型的。
*计算向量的长度：v.size()
* 若与最高分相差10分内：A等；20分内：B等；30分内：C等；其他D等
* */
import java.util.Scanner;
import java.util.Vector;
public class WrapperTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner scanner = new Scanner(System.in);
        boolean isFlag = true;
        System.out.println("请输入学生成绩(输入负数结束): ");
        int StudentCount = 1;
        int maxScore = 0;
        while (isFlag) {
            System.out.println("请输入第" + StudentCount + "个学生的成绩: ");
            int score = scanner.nextInt();
            if (score < 0) {
                isFlag = false;
            }
            if (score > 100) {
                System.out.println("非法数据，请重新输入");
                continue;
            }
            Integer i = score;      //自动装箱
            v.addElement(i);
            //取最大值
            if (maxScore < score) {
                maxScore = score;
            }
            StudentCount++;
        }

        System.out.println("*********判断等级*********");
        for (int i = 0; i < v.size() - 1; i++) {
            if ((maxScore - (Integer)v.elementAt(i)) < 10) {
                System.out.println(v.elementAt(i) + "分属于A等");
            } else if ((maxScore - (Integer)v.elementAt(i)) < 20) {
                System.out.println(v.elementAt(i) + "分属于B等");
            } else if ((maxScore - (Integer)v.elementAt(i)) < 30) {
                System.out.println(v.elementAt(i) + "分属于C等");
            } else {
                System.out.println(v.elementAt(i) + "分属于D等");
            }
        }


    }

}
