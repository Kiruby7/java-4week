import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数");
        double a=sc.nextDouble();
        System.out.print("请输入第二个数");
        double b=sc.nextDouble();
        System.out.print("请输入第三个数");
        double c=sc.nextDouble();
        double sum=a+b+c;
        double avg=sum/3;
        System.out.printf("总分=%.2f,平均分=%.2f%n",sum,avg);
    }
}
