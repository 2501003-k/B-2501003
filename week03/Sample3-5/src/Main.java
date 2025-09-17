import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float litter = 0.0f; // 준비물
        float km = 0.0f;
        float result = 0.0f;

        System.out.print("소비된 연료 량 입력 :"); // 입력
        litter = keyboard.nextFloat();
        System.out.print("운행한 거리 입력 :");
        km = keyboard.nextFloat();

        result = km/litter; // 처리

        System.out.printf("자동차 소비된 연료 : %.1f Litter\n",litter); // 출력
        System.out.printf("자동차 운행 거리 : %.1f %c\n",km,'\u339E'); // 유니코드 기호는 '백슬래시u' 가 필수
        System.out.printf("연비 : %.2f %c\n",result,'\u339E');

    }
}