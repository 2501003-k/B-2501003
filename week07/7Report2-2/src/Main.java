import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int TICKET = 10000;
        int time = 0;
        int age = 0;
        int money = 0;
        int discount = 0;

        System.out.print("영화 관람 시간 입력(0시 ~ 23시 사이) : ");
        time = keyboard.nextInt();
        System.out.print("당신의 나이 입력 : ");
        age = keyboard.nextInt();

        if (time >= 6 && time <= 10) {
            discount = (int) (TICKET * 0.2);
        } else if (age >= 8 && age < 19) {
            discount = (int) (TICKET * 0.3);
        } else if (age >= 65) {
            discount = (int) (TICKET * 0.4);
        }

        money = TICKET - discount;

        System.out.printf("회원님께서 지불 해야할 금액은 총 %,d원 입니다.\n", money);
    }
}