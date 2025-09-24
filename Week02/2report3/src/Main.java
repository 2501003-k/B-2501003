import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = ""; // 준비물
        int Count = 0;
        String location = "";


        System.out.print("당신의 이름은 ? "); // 입력
        name = keyboard.nextLine();
        System.out.printf("%s님의 가족은 몇 명입니까 ? ", name);
        Count = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s님의 가족은 어디에서 살지요 ? ", name);
        location = keyboard.nextLine();


        System.out.printf("%s님의 가족은 %d명 입니다.\n", name, Count); // 출력
        System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n", name, location);
    }
}