import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int dollar;   // 100cent
        int half;     // 50cent
        int quarter;  // 25cent
        int dime;     // 10cent
        int nickel;   // 5cent
        int penny;    // 1cent

        int total;    // 총 센트
        int won;      // 달러 단위
        int cent;     // 남은 센트

        System.out.print("Dollar 개수 : ");
        dollar = keyboard.nextInt();
        System.out.print("Half 개수 : ");
        half = keyboard.nextInt();
        System.out.print("Quarter 개수 : ");
        quarter = keyboard.nextInt();
        System.out.print("Dime 개수 : ");
        dime = keyboard.nextInt();
        System.out.print("Nickel 개수 : ");
        nickel = keyboard.nextInt();
        System.out.print("Penny 개수 : ");
        penny = keyboard.nextInt();

        total = dollar * 100 + half * 50 + quarter * 25
                + dime * 10 + nickel * 5 + penny;

        won = total / 100; // 나누기
        cent = total % 100; // 나눈 후 나머지 값

        System.out.printf("총 금액은 : %d Dollar %d Cent\n", won, cent);
        System.out.printf("센트로는 총 %d Cent 입니다.\n", total);

        keyboard.close();
    }
}