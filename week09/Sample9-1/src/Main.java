//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        System.out.println("I love you. ");

        for (int i = 0; i <= 10; i++) {  // 횟수가 정해져있다면 for문 제어 변수, 증감식 다 하나에 들어가있음.
           System.out.println("I love you. ");
        }
        System.out.println();

        int i = 0; // while 문은 증감식, 제어 변수 다 따로따로 떨어져있음.
        while (i <= 10) {
            System.out.println("I love you. ");
            i++;
        }

        System.out.println();
        i = 0; // 초기값
        do {
            System.out.println("I love you. ");
            i++; // 증가값
        } while (i <= 10); // 조건
    }
}