import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[][] students = {
                {"12345", "홍길동"}, {"34563", "이혜인"},
                {"45321", "김명성"}, {"56456", "경복대"}, {"67853", "이대학"}
        };
        String[] subject = {"국어", "영어", "수학"};

        int[][] score = new int[students.length][subject.length + 1];
        float[] avg = new float[students.length];
        boolean swapped;

        // 점수 입력
        for (int i = 0; i < students.length; i++) {
            int j = 0;
            while (j < subject.length) {
                System.out.printf("%s님의 %s 성적 : ", students[i][1], subject[j]);
                int input = keyboard.nextInt();

                if (input >= 0 && input <= 100) {
                    score[i][j] = input;
                    j++;
                } else {
                    System.err.println("ERROR : 0 ~ 100");
                    keyboard.nextLine();  // 입력 버퍼 정리
                }
            }
        }

        // 총점 계산
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subject.length; j++) {
                score[i][3] += score[i][j];
            }
        }

        // 버블 정렬 (총점 기준 내림차순)
        for (int i = 0; i < students.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < students.length - 1 - i; j++) {

                if (score[j][3] < score[j + 1][3]) {  // j vs j+1 비교

                    // 학생 swap
                    String[] tempStd = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tempStd;

                    // 점수 swap
                    int[] tempScore = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = tempScore;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        // 평균 계산
        for (int i = 0; i < students.length; i++) {
            avg[i] = score[i][3] / 3.0f;
        }

        // 최종 출력
        System.out.println("***************************************");
        System.out.println("  학번  이름  국어  영어  수학  총점   평균");
        System.out.println("***************************************");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%6s %4s %4d %4d %4d %4d %7.2f\n",
                    students[i][0], students[i][1],
                    score[i][0], score[i][1], score[i][2], score[i][3], avg[i]);
        }

        System.out.println("***************************************");
    }
}