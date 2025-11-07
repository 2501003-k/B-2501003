public class Main {
    public static void main(String[] args) {

        final int DEPTH = 300;   // 우물 깊이는 3m, 즉 300cm
        final int UP = 55;       // 낮 동안 55cm 올라감
        final int DOWN = 13;     // 밤 동안 13cm 미끄러짐
        int height = 0;          // 현재 높이
        int day = 0;             // 탈출하는 데 걸린 날짜 수

        while (height < DEPTH) {
            day++;                        // 하루씩 증가 (후위 연산자)
            height += UP;                 // 낮 동안 올라감, height = height + UP; 과 동일
            System.out.printf("%d일차 낮 - 현재 높이: %dcm\n", day, height);
            if (height >= DEPTH) {        // 현재 높이가 꼭대기보다 높으면 탈출이므로 종료
                break;
            }
            height -= DOWN;               // 밤 동안 미끄러짐, height = height - DOWN; 과 동일
            System.out.printf("%d일차 밤 - 미끄러진 후 높이: %dcm\n", day, height);
        }
        System.out.printf("\n달팽이는 %d일 만에 우물에서 탈출했습니다.\n", day);
    }
}