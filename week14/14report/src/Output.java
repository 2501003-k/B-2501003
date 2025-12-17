public class Output {

    public static void printAll(String[][][] stu, int[][][] score,
                                float[][] avg, int[][] classRank,
                                int[] gradeRank, float[] classAvg, float gradeAvg) {

        int gradeIdx = 0;

        for (int b = 0; b < stu.length; b++) {

            System.out.printf("\n                                    *** %d반 성적표 ***\n", b + 1);
            display();
            System.out.println("   학번   이름      국어 영어  수학  선택    총점   평균     반석차     학년석차  기타");
            display();

            for (int s = 0; s < stu[b].length; s++) {

                int kor = score[b][s][0];
                int eng = score[b][s][1];
                int mat = score[b][s][2];
                int sel = score[b][s][3];

                int total = kor + eng + mat + sel;

                String etc = (avg[b][s] < classAvg[b]) ? "반평균 미만" : "";

                System.out.printf("%s %-6s %4d %4d %4d %4d %6d %7.2f %6d %10d %-10s\n",
                        stu[b][s][0], stu[b][s][1],
                        kor, eng, mat, sel,
                        total, avg[b][s],
                        classRank[b][s], gradeRank[gradeIdx++],
                        etc);
            }

            display();
            System.out.printf("%d반 전체 평균 : %.2f\n", b + 1, classAvg[b]);
            System.out.println();
        }

        System.out.printf("학년 전체 평균 : %.2f\n", gradeAvg);
    }

    private static void display() {
        System.out.println("************************************************************************************");
    }
}