import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] name = {"이대한", "홍길동", "한나라", "이순신", "김혜숙",
                "김현호", "나희영", "이동국", "박예림", "김동근"};
        String[] hakbun = {"1601007", "1601003", "1601013", "1601024", "1601096",
                "1601058", "1601110", "1601077", "1601085", "1601026"};
        int[] mid = new int[name.length];
        int[] fin = new int[name.length];
        int[] quiz = new int[name.length];
        int[] report = new int[name.length];
        int[] attend = new int[name.length];

        float[] score = new float[name.length];

        int i = 0;

        while (i < name.length) { // 입력
            System.out.printf("%s 학생의 중간 점수 입력 : ", name[i]);
            mid[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 기말 점수 입력 : ", name[i]);
            fin[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 퀴즈 점수 입력 : ", name[i]);
            quiz[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 레포트 점수 입력 : ", name[i]);
            report[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 출석 점수 입력 : ", name[i]);
            attend[i] = keyboard.nextInt();

            if ((mid[i] >= 0 && mid[i] <= 100) &&
                    (fin[i] >= 0 && fin[i] <= 100) &&
                    (quiz[i] >= 0 && quiz[i] <= 100) &&
                    (report[i] >= 0 && report[i] <= 100) &&
                    (attend[i] >= 0 && attend[i] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100 입력");
                System.in.read();
            }
        }

        for (i = 0; i < name.length; i++) { // 가중치 계산
            score[i] = mid[i] * 0.15f +
                    fin[i] * 0.15f +
                    quiz[i] * 0.10f +
                    report[i] * 0.40f +
                    attend[i] * 0.20f;
        }

        for (i = 0; i < name.length - 1; i++) { // 가중치 점수 기준 내림차순
            for (int j = i + 1; j < name.length; j++) {

                if (score[i] < score[j]) {

                    float temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;

                    int temp1;

                    temp1 = mid[i];
                    mid[i] = mid[j];
                    mid[j] = temp1;

                    temp1 = fin[i];
                    fin[i] = fin[j];
                    fin[j] = temp1;

                    temp1 = quiz[i];
                    quiz[i] = quiz[j];
                    quiz[j] = temp1;

                    temp1 = report[i];
                    report[i] = report[j];
                    report[j] = temp1;

                    temp1 = attend[i];
                    attend[i] = attend[j];
                    attend[j] = temp1;

                    String tmp = name[i];
                    name[i] = name[j];
                    name[j] = tmp;

                    tmp = hakbun[i];
                    hakbun[i] = hakbun[j];
                    hakbun[j] = tmp;
                }
            }
        }

        System.out.println("*************************************************");
        System.out.println(" 학번    이름   중간  기말  퀴즈  레포트  출석   점수");
        System.out.println("*************************************************");
        for (i = 0; i < name.length; i++) {
            System.out.printf("%7s %3s  %3d  %3d  %3d   %3d   %3d   %5.2f\n",
                    hakbun[i], name[i], mid[i], fin[i], quiz[i],
                    report[i], attend[i], score[i]);
        }
        System.out.println("*************************************************");
    }
}
