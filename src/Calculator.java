import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入第一个数：");
        double a = sc.nextDouble();

        System.out.print("请输入第二个数：");
        double b = sc.nextDouble();

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        if(b==0){
            System.out.println("除数不能为0");
        }
        else{
            System.out.println("a/b="+(a/b));
        }
    }
}
