import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] score = new int[10]; // 학생 점수 저장
        int total = 0;   // 합계
        float average;   // 평균
        int max;         // 최대값
        int min;         // 최소값

        System.out.println("10명의 JAVA 성적을 입력하세요.");

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d번 학생 점수 : ", i + 1);
            score[i] = keyboard.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        average = (float) total / score.length;

        max = score[0];
        min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("결과 출력");
        System.out.println("합계: " + total);
        System.out.println("평균: " + average);
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
