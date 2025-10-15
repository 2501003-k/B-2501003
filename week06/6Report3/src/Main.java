import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age = 0;
        char use = ' ';
        int time = 0;
        int result = 0;
        int card = 0;
        int money = 0;

        System.out.print("당신의 나이 입력 : ");
        age = keyboard.nextInt();
        System.out.print("교통 카드 사용 여부(Y/N) : ");
        use = keyboard.next().charAt(0);

        System.out.print("탑승 시각 : ");
        time = keyboard.nextInt();
        card = (age >= 0 && age <= 13) ? 450 : (age >= 14 && age < 20) ? 750 : 1250;
        money = (age >= 0 && age <= 13) ? 450 : (age >= 14 && age < 20) ? 850 : 1350;

        result = (int) (use == 'Y' && ((time >= 0 && time < 5) || (time >=22 && time <= 23)) ?
                        card * 1.2 : use == 'N' && ((time >= 0 && time < 5) || (time >=22 && time <= 23)) ? money * 1.2 :
                           use == 'Y' && (time >= 5 && time < 22) ? card :
                                   use == 'N' && (time >= 5 && time < 22 ) ? money : 0);


        System.out.printf("당신의 나이는 %d살 입니다.\n", age);
        System.out.printf("교통카드 사용 여부 : %c \n", use);
        System.out.printf("탑승 시각 : %d시\n", time);
        System.out.printf("지불 금액은 %,d원 입니다.\n", result);
    }
}