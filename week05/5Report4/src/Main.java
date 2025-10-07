import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        String free = "";
        int total = 0;
        char member = ' ';

        System.out.print("회원님의 이름 입력 : ");
        name = keyboard.nextLine();
        System.out.print("회원님의 총 구매 금액 : ");
        total = keyboard.nextInt();
        System.out.print("회원님의 멤버십 가입 여부 (Y/N) : ");
        member = keyboard.next().charAt(0);

        free = ((total >= 50000) || ((member == 'Y') && total >= 30000)) ? "무료배송 적용 대상" : "유료배송 적용 대상";

        System.out.printf("%s님은 %s 입니다.\n", name, free);
    }
}