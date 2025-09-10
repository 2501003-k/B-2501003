import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        // 준비물
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        short age = 0;
        float height = 0.0f;  //double 쓰면 f 안 써도 됨
        float weight = 0.0f;

        //data 입력
        System.out.print("당신의 이름은? ");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는? ", name);
        age = keyboard.nextShort();
        System.out.printf("%s님의 키는? ", name);
        height = keyboard.nextFloat();
        System.out.printf("%s님의 몸무게는? ", name);
        weight = keyboard.nextFloat();

        //처리


        //입력
        System.out.printf("%s님의 나이는 %d살 입니다. \n", name, age);
        System.out.printf("%s님의 키는 %.1f cm 입니다. \n", name, height);  //'%.1f'는 소숫점 한 자리만 표현
        System.out.printf("%s님의 몸무게는 %.1f kg 입니다. \n", name, weight);

    }
}