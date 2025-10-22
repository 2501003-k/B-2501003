import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String weather = "";
        float temp = 0.0f;

        System.out.print("현재 온도 입력 : ");
        temp = keyboard.nextInt();

        if (temp >= 35) {
            weather = "폭염 경보";
        }
        if (temp >= 30 && temp < 35) {
            weather = "폭염 주의보";
        }
        if (temp >= -10 && temp < 30) {
            weather = "정상 온도";
        } else if (temp < -10) {
            weather = "한파 경보";
        }
        System.out.printf("%s\n", weather);
    }
}