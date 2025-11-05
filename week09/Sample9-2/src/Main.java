import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int start;
        int last;
        int sum = 0;

        while (true) { // true라고 하게 되면 무한 loop문이 발생함. 반드시 break를 넣어서 빠져나와야함
            System.out.print("어디부터 더할까요 ? ");
            start = keyboard.nextInt();
            System.out.print("어디까지 더할까요 ? ");
            last = keyboard.nextInt();

            if (start >= last) {
                System.err.println("ERROR : start가 Last보다는 작아야 함");
                System.in.read(); // 엔터 값을 읽는다.
            } else {
                break;
            }
        }

        for (int i = start; i <= last; i++) { // break가 걸리면 여기로 넘어옴 그렇지 않으면 계속 위에 반복문이 여러번 발생
            sum += i;
        }

        System.out.printf("%d + %d + ... + %d = %d\n", start, start + 1, last, sum);
    }
}