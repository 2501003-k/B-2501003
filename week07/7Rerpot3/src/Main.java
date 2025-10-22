import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int kor,eng,math;
        float avg;
        char point = ' ';
        String result = "";

        System.out.print("국어, 영어, 수학 점수는(0 ~ 100점 사이 입력) ? ");
        kor = keyboard.nextInt();
        eng = keyboard.nextInt();
        math = keyboard.nextInt();

        avg =  (float) (kor + eng + math) / 3;
        if (avg <= 100) {
            if (avg >= 90) {
                point = 'A';
            } else if (avg >= 80) {
                point = 'B';
            } else if (avg >= 70) {
                point = 'C';
            } else if (avg >= 60) {
                point = 'D';
            } else {
                point = 'F';
            }
            result = avg >= 80 ? "성적 양호" : ((avg >= 60) ? "노력" : "성적 불량");

            System.out.println("=================================");
            System.out.println(" 국어 영어  수학  평균   학점   결 과");
            System.out.printf(" %d   %d   %d  %.2f   %c  %s\n", kor,eng,math,avg,point,result);
            System.out.println("=================================");
        } else {
            System.err.println("ERROR : 평균이 100점을 넘길 수 없습니다.\n");
        }

    }
}