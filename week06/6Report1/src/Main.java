import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int FOOD = 4800;
        int count = 0;
        int result = 0;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;

        System.out.print("구매 할 식권 개수? ");
        count = keyboard.nextInt();

        temp1 = (int) (FOOD * count * 0.1);
        temp2 = (int) (FOOD * count * 0.15);
        temp3 = (int) (FOOD * count * 0.2);
        result = (count >= 10 && count < 20) ? ((FOOD * count) - temp1) :
                (count >= 20 && count < 30) ? ((FOOD * count) - temp2) :
                        count >= 30 ? ((FOOD * count) - temp3) : FOOD * count;

        System.out.printf("K-대학교의 식권 가격은 1장당 %,d원 입니다.\n", FOOD);
        System.out.printf("결제하신 식권 개수는 %d개 이고,\n결제 할 금액은 %,d원 입니다.\n", count, result);
    }
}