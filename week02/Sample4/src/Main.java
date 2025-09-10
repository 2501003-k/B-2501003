import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 준비물
        int first = 0;
        int second = 0;
        int result = 0;

        // Data 입력
        System.out.print("첫번째 값 입력 :");
        first = keyboard.nextInt();
        System.out.print("두번째 값 입력 :");
        second = keyboard.nextInt();


        // 처리
        result = first * second;


        // 출력 (필수) <-- 필수니까 제일 1순위로 적기
        System.out.printf("%,d * %,d = %,d\n", first, second, result);
    }
}