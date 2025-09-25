import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int total;
        int amount;
        int duty;

        System.out.print("판매금액은 ? ");
        total = keyboard.nextInt();

        amount = (int)(total / 1.1);
        duty = total - amount;

        System.out.printf("판매금액 : %,d원\n", total);
        System.out.printf("금액 : %,d원\n", amount);
        System.out.printf("세금 : %,d원\n", duty);

        keyboard.close();
    }
}