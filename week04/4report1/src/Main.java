import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size;
        int result;
        final int PRICE = 56000;

        System.out.print("주택지 평수를 입력 : ");
        size = keyboard.nextInt();

        result = (((size * PRICE) / 1000) * 1000);

        System.out.printf("주택지 평수는 %d평 이고,\n",size);
        System.out.printf("주택지 가격은 %,d원 입니다.\n",result);
    }
}