import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[][] employees = {{"홍길동", "1111"}, {"강민성", "1211"}, {"김명성", "2111"},
                {"박건준", "1441"}, {"오유빈", "1444"}, {"니키타", "1456"},
                {"한정호", "1678"}, {"파마트", "1567"}, {"이예린", "1789"},
                {"제이넵", "1789"}};
        int[] hobong = {1, 4, 5, 3, 2, 1, 3, 4, 3, 2};
        int[][] salarys = new int[employees.length][5]; // {기본급, 업무수당, 급여액, 세금, 지급액}

//        int[][] salarys = {{1, 0, 0, 0, 0, 0}, {4, 0, 0, 0, 0, 0}, } // hobong과 salarys를 합친것
                                                                     // 다만 {호봉, 기본긊, 업무수당, 급여액, 세금, 지급액} 순으로 적어야함

        int i = 0;
        while (i < employees.length) {
            System.out.printf("%s님의 업무 수당 입력 : ", employees[i][0]);
            salarys[i][1] = keyboard.nextInt();

            if (salarys[i][1] >= 0 && salarys[i][1] <= 1000000) {
                i++;
            } else {
                System.out.println("ERROR : 업무 수당은 0 ~ 1,000,000");
                System.in.read();
            }
        }

        for (i = 0; i < employees.length; i++) {
            switch (hobong[i]) {
                case 1 :
                    salarys[i][0] = 1650000;
                    break;
                case 2 :
                    salarys[i][0] = 1680000;
                    break;
                case 3 :
                    salarys[i][0] = 1700000;
                    break;
                case 4 :
                    salarys[i][0] = 1720000;
                    break;
                case 5 :
                    salarys[i][0] = 1750000;
                    break;
                default:
                    salarys[i][0] = 0;
            }
        }

        for (i = 0; i < employees.length; i++) {
            salarys[i][2] = salarys[i][0] + salarys[i][1];
        }

        for (i = 0; i < employees.length; i++) {
            if (salarys[i][2] >= 2600000) {
                salarys[i][3] = (int)(salarys[i][2] * (10.0f / 100));
            } else if (salarys[i][2] >= 2000000) {
                salarys[i][3] = (int)(salarys[i][2] * (8.0f / 100));
            } else {
                salarys[i][3] = (int)(salarys[i][2] * (5.0f / 100));
            }
        }


        for (i = 0; i < employees.length; i++) {
            salarys[i][4] = salarys[i][2] - salarys[i][3];
        }

        for (i = 0; i < employees.length - 1; i++) {        // 회전 수
            for (int j = 0; j < employees.length - 1 - i; j++) { // 비교 반복
                if (salarys[j][4] > salarys[j + 1][4]) {
                    // 왼쪽이 더 크면 swap
                    String[] temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;

                    int temp1 = hobong[j];
                    hobong[j] = hobong[j + 1];
                    hobong[j + 1] = temp1;

                    int[] temp2 = salarys[j];
                    salarys[j] = salarys[j + 1];
                    salarys[j + 1] = temp2;
                }
            }
        }

        System.out.println("***************************************************************");
        System.out.println("  이름   사번 호봉  기본금      업무수당   급여액      세금     지급액");
        System.out.println("***************************************************************");

        for (i = 0; i < employees.length; i++) {
            System.out.printf("%4s %5s %2d %,9d %,9d %,9d %,8d %,9d\n", employees[i][0], employees[i][1],
                    hobong[i], salarys[i][0], salarys[i][1], salarys[i][2], salarys[i][3], salarys[i][4]);
        }
        System.out.println("****************************************************************");

    }
}