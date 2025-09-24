import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // 준비물
        double celsius = 0.0;
        double fahrenheit = 0.0;


        System.out.print("섭씨 온도는 몇도 인가요?(℃): "); // 입력
        celsius = keyboard.nextDouble();


        fahrenheit = celsius * 9 / 5 + 32; // 처리


        System.out.printf("섭씨 %.2f℃는 화씨 %.2f℉ 입니다.\n", celsius, fahrenheit); // 출력

        keyboard.close();
    }
}