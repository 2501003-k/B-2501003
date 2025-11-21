import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 준비물 (선언문)
        Scanner keyboard = new Scanner(System.in);

        String[][] user = new String[10][2]; // 번호, 이름
        String[] gu = new String[10]; // 구분

        double[] amount = new double[10]; // 사용량
        int[] money = new int[10]; // 사용 금액

        int[] tax = new int[10]; // 세금
        int[] total = new int[10]; // 납부액

        String[] note = new String[10]; // 비고

        final int BASIC = 1200; // 기본료 1200원

        int[] price = {40, 55, 78, 35, 20}; // 단가
        double[] rate = {5, 3.5, 2.5, 1.5, 0}; // 세율

        // 입력
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d번째 사용자의 번호 입력(4자리): ", i+1);
            user[i][0] = keyboard.next();
            System.out.printf("%d번째 사용자의 이름 입력: ", i+1);
            user[i][1] = keyboard.next();
            System.out.printf("%s님의 수도 코드 입력(1~5): ", user[i][1]);
            int code = keyboard.nextInt();

            int priceValue = 0;
            double taxRate = 0;

            switch (code) {
                case 1:
                    gu[i] = "가정용";
                    priceValue = price[0];
                    taxRate = rate[0];
                    note[i] = "";
                    break;
                case 2:
                    gu[i] = "영업용";
                    priceValue = price[1];
                    taxRate = rate[1];
                    note[i] = "";
                    break;
                case 3:
                    gu[i] = "공장용";
                    priceValue = price[2];
                    taxRate = rate[2];
                    note[i] = "";
                    break;
                case 4:
                    gu[i] = "관공서";
                    priceValue = price[3];
                    taxRate = rate[3];
                    note[i] = "";
                    break;
                case 5:
                    gu[i] = "군기관";
                    priceValue = price[4];
                    taxRate = rate[4];
                    note[i] = "일괄징수";
                    break;
                default:
                    System.err.println("ERROR : 수도코드는 1 ~ 5만 입력 가능.");
                    System.in.read();
                    i--; // i를 증가시키지 않고 내림으로써 다시 동일 인물의 번호를 입력하게 되돌아감.
                    continue; // continue는 for 문의 증감식 부분으로 이동
            }
            System.out.print("사용량(소수점 1자리 입력): ");
            amount[i] = keyboard.nextDouble();

            // 처리
            int amt = (int)Math.round(amount[i]); // 사용량 반올림
            int useMoney = amt * priceValue;     // 사용금액
            money[i] = useMoney;

            double tempTax = (BASIC + useMoney) * (taxRate / 100.0);
            tax[i] = (int)(tempTax / 10) * 10;   // 세금 절사

            total[i] = BASIC + useMoney + tax[i]; // 납부액
        }

        // 출력
        System.out.println("                                   수   도   요   금                                   ");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("번호   이름     구분        사용량       사용금액       TAX        납부액       비고");
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4s  %-4s  %-5s   %7.1f   %,10d   %,8d   %,10d     %s\n",
                    user[i][0], user[i][1], gu[i],
                    amount[i], money[i], tax[i], total[i], note[i]);
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
