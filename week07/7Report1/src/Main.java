import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1,num2,num3;
        int max=0;
        int mid=0;
        int min=0;

        System.out.print("3개의 정수 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        if (num1 >= num2 && num1 >= num3) {     // max = num1 인 조건
            if (num2 >= num3) {
                max = num1;
                mid = num2;
                min = num3;
            }
            else {
                max = num1;
                mid = num3;
                min = num2;
            }
        }
        else if (num2 >= num1 && num2 >= num3) {    // max = num2 인 조건
            if (num1 >= num3) {
                max = num2;
                mid = num1;
                min = num3;
            }
            else {
                max = num2;
                mid = num3;
                min = num1;
            }
        }
        else {                                      // max = num3 인 조건
            if (num1 >= num2) {
                max = num3;
                mid = num1;
                min = num2;
            } else {
                max = num3;
                mid = num2;
                min = num1;
            }
        }
        System.out.printf("입력받은 %d, %d, %d를 크기 순으로 나열하면 %d, %d, %d 입니다.\n", num1, num2, num3, min, mid, max);
    }
}