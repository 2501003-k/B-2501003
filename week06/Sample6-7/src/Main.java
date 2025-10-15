import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float weight = 0.0f;
        final int GOLD = 849000;
        float don = 0.0f;
        long result = 0;

        System.out.print("당신의 체중은? ");
        weight = keyboard.nextFloat();

        don = weight * 1000 / 3.75f; // 실수는 double 형이 기본 고로 3.75에 f를 붙여서 float 으로 만들어줘야함
        result = (long) (don * GOLD);

        System.out.printf("금 1돈(3.75g)의 가격은 %,d원 입니다.\n", GOLD);
        System.out.printf("나의 체중은 %.1f Kg(%.1f 돈) 입니다.\n", weight, don);
        System.out.printf("나의 몸값은 %,d원 입니다.\n", result);
    }
}