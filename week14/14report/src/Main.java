import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 홀수 버전 ( 내 학번이 2501003 이므로 홀수 버전, 즉 동적 할당 )
        String[][][] students = new String[3][][];

        students[0] = new String[][]{
                {"2501003","강성우","남"}, {"2501004","홍길동","남"},
                {"2501005","박가영","여"}, {"2501006","김철수","남"}
        };
        students[1] = new String[][]{
                {"2501007","김성욱","남"}, {"2501008","홍길순","여"},
                {"2501009","임가영","여"}, {"2501010","안철수","남"}
        };
        students[2] = new String[][]{
                {"2501011","박성재","남"}, {"2501012","박다혜","여"},
                {"2501013","임다희","여"}, {"2501014","김종인","남"}
        };

        // 성적 배열 준비
        int[][][] score = new int[students.length][][];
        float[][] avg = new float[students.length][];

        for (int b = 0; b < students.length; b++) {
            score[b] = new int[students[b].length][4];
            avg[b] = new float[students[b].length];
        }

        // 입력
        Input.inputScore(students, score, keyboard);

        // 계산
        Compute.computeAverage(score, avg);
        int[][] classRank = Compute.classRank(avg);
        int[] gradeRank = Compute.gradeRank(avg);
        float[] classAvg = Compute.computeClassAvg(avg);
        float gradeAvg = Compute.computeGradeAvg(avg);

        // 출력
        Output.printAll(students, score, avg, classRank, gradeRank, classAvg, gradeAvg);

        System.out.println("프로그램 종료");
    }
}