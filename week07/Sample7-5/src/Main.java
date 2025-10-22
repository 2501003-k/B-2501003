import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0, result = 0;

        System.out.print("정수 값 입력: ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        result = (num1 > num2)
               ? ((num1 > num3) ? num1 : num3)
               : ((num2 > num3) ? num2 : num3);
        System.out.printf("입력한 %d와 %d와 %d중에 제일 큰 값은 %d 입니다.\n",num1,num2,num3,result);

        if (num1 >= num2) {
            if (num1 >= num3) {
                result = num1;
            } else {
                result = num3;
            }
        }
        else if (num2 >= num3) {
                result = num2;
            }
        else {
                result = num3;
            }
            System.out.printf("입력한 %d와 %d와 %d중에 제일 큰 값은 %d 입니다.\n", num1, num2, num3, result);
        if (num1 >= num2 && num1 >= num3) {
            result = num1;
        }
        else if (num2 >= num1 && num2 >= num3){
            result = num2;
        }
        else {
            result = num3;
        }
            System.out.printf("입력한 %d와 %d와 %d중에 제일 큰 값은 %d 입니다.\n", num1, num2, num3, result);
        }
    }