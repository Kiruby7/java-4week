import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;   // 1~100

        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("请猜一个 1~100 的数：");
            int guess = sc.nextInt();
            count++;

            if (guess == target) {
                // 猜中：输出"猜对了，共猜了 N 次"，然后 break
                System.out.println("猜对了，共猜了"+count+"次");
                break;
            } else if (guess > target) {
                // 提示"大了"
                System.out.println("大了");
            } else {
                // 提示"小了"
                System.out.println("小了");
            }
        }
    }
}
