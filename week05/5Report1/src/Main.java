import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int ch = 0;
        int convert = 0;

        System.out.print("하나의 영 문자 입력 : ");
        ch = keyboard.next().charAt(0);

        convert = (ch >= 'A' && ch <= 'Z') ? ch + 32 :
                  (ch >= 'a' && ch <= 'z') ? ch - 32 : 0;

        System.out.printf(
                (convert == 0) ? "영문자가 아닙니다.\n"
                        : (ch >= 'A' && ch <= 'Z') ?
                ("입력문자 %c는 대문자이고, 소문자로 변경하면 %c 입니다.\n") :
                ("입력문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.\n"),ch,convert);

    }
}