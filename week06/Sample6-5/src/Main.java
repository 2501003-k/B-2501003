import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MPS = 340; // 단위가 meter
        float fighter = 0.0f;
        float temp = 0.0f;
        int result = 0;

        System.out.print("전투기의 스피드 입력 : ");
        fighter = keyboard.nextFloat();

        temp = fighter * 365 * 24 * 60 * 60 * MPS;
        result = (int) (temp / 1000);

        System.out.printf("마하 %.1f인 전투기의 1년간 이동한 거리는 %,d Km 입니다.\n", fighter, result);

    }
}