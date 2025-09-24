import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int radius = 0;     // 준비물
        double boxArea = 0.0;
        double circleArea = 0.0;
        double resultArea = 0.0;

        System.out.print("원의 반지름을 입력하세요: "); // 입력
        radius = keyboard.nextInt();

        boxArea = (radius * 2) * (radius * 2); // 처리
        circleArea = Math.PI * radius * radius;
        resultArea = boxArea - circleArea;

        System.out.printf("\n정사각형 면적 : %.0f Cm2\n", boxArea); // 출력
        System.out.printf("원의 면적 : %.2f Cm2\n", circleArea);
        System.out.printf("구하는 면적 : %.2f Cm2\n", resultArea);
    }
}