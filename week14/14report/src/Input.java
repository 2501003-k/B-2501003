import java.util.Scanner;

public class Input {

    public static void inputScore(String[][][] students, int[][][] score, Scanner keyboard) {

        for (int b = 0; b < students.length; b++) {

            System.out.printf("\n*** %d반 성적 입력 ***\n", b + 1);

            for (int s = 0; s < students[b].length; s++) {

                String name = students[b][s][1];
                String gender = students[b][s][2];

                score[b][s][0] = inputOne(name, "국어", keyboard);
                score[b][s][1] = inputOne(name, "영어", keyboard);
                score[b][s][2] = inputOne(name, "수학", keyboard);

                String subject = gender.equals("남") ? "기술" : "가정";
                score[b][s][3] = inputOne(name, subject, keyboard);

                System.out.println(); // 학생 간 공백
            }
        }
    }

    private static int inputOne(String name, String subject, Scanner keyboard) {

        while (true) {
            System.out.printf("%s 학생의 %s 점수 입력 : ", name, subject);

            int x = keyboard.nextInt();

            if (x >= 0 && x <= 100)
                return x;

            System.out.println("ERROR : 점수는 0~100 사이여야 합니다. 다시 입력하세요.\n");
        }
    }
}