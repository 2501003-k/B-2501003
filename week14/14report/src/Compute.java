public class Compute {

    // 학생별 평균 계산
    public static void computeAverage(int[][][] score, float[][] avg) {
        for (int b = 0; b < score.length; b++) {
            for (int s = 0; s < score[b].length; s++) {

                int total = score[b][s][0] + score[b][s][1] +
                        score[b][s][2] + score[b][s][3];

                avg[b][s] = total / 4.0f;
            }
        }
    }

    // 반 석차
    public static int[][] classRank(float[][] avg) {

        int[][] rank = new int[avg.length][];

        for (int b = 0; b < avg.length; b++) {

            rank[b] = new int[avg[b].length];

            for (int i = 0; i < avg[b].length; i++) {

                int r = 1;
                for (int j = 0; j < avg[b].length; j++) {
                    if (avg[b][j] > avg[b][i]) r++;
                }
                rank[b][i] = r;
            }
        }

        return rank;
    }

    // 학년 석차
    public static int[] gradeRank(float[][] avg) {

        int count = 0;
        for (float[] a : avg) count += a.length;

        float[] flat = new float[count];
        int idx = 0;

        for (int b = 0; b < avg.length; b++)
            for (int s = 0; s < avg[b].length; s++)
                flat[idx++] = avg[b][s];

        int[] rank = new int[count];

        for (int i = 0; i < count; i++) {
            int r = 1;
            for (int j = 0; j < count; j++) {
                if (flat[j] > flat[i]) r++;
            }
            rank[i] = r;
        }
        return rank;
    }

    // 반 평균
    public static float[] computeClassAvg(float[][] avg) {
        float[] arr = new float[avg.length];

        for (int b = 0; b < avg.length; b++) {
            float sum = 0;
            for (int s = 0; s < avg[b].length; s++)
                sum += avg[b][s];
            arr[b] = sum / avg[b].length;
        }
        return arr;
    }

    // 학년 전체 평균
    public static float computeGradeAvg(float[][] avg) {
        float sum = 0;
        int count = 0;

        for (float[] a : avg)
            for (float v : a) {
                sum += v;
                count++;
            }

        return sum / count;
    }
}