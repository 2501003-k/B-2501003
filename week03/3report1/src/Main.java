import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int result = 0;


        System.out.print("첫번째 숫자를 입력하세요");
        first = keyboard.nextInt();
        System.out.print("두번째 숫자를 입력하세요");
        second = keyboard.nextInt();

        result = first + second;

        System.out.printf("%d + %d = %d\n",first,second,result);

    }
}