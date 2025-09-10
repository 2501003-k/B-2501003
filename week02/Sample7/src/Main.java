import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //준비물
        char ch = ' ';

        //입력
        System.out.print("문자 하나 입력 : ");
        ch = keyboard.next().charAt(0);
        //처리

        //출력 <-- 필수니까 제일 1순위로 적기
        System.out.printf("입력한 문자 %c의 ASCII 코드는 %h이다.\n", ch, ch);
    }
}