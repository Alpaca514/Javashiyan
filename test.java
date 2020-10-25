package Test;
import java.util.Scanner;
    public class test {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            teacher a = new teacher(2, "罗翔", "男", "刑法");
            teacher b = new teacher(2, "局座", "男", "海军");
            course c = new course("c2057", "教300", "13:30", "法学", a);
            course d = new course("a2079", "教301", "14:30", "海军40年课程", b);
            student i = new student(13, "张三", "男",c);
            System.out.println("课程信息：");
            System.out.println("课程1：" + c);
            System.out.println("课程2：" + d);
            System.out.println("请输入所选课程编号：");
            int j = in.nextInt();
            switch (j) {
                case 1:
                    i.setZ(c);
                    break;
                case 2:
                    i.setZ(d);
                    break;

                default:
                    System.out.println("选课无效");
                    return;
            }
            System.out.println("选课成功，您选择了" + j + "号课程,课程信息：");
            System.out.println(i);
            System.out.println("退课不？（退课请输入5，确认不需要退课请输入6）");
            int k = in.nextInt();
            if (k == 5) {
                i.setZ(null);
                System.out.println("不许退");
                System.out.println(i);

            } else {
                System.out.println("选课成功！");
            }
    }
}
