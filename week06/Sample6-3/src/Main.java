//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int YEAR = 365;
        final int SPEED = 300000; // 빛이 1초에 30만 km 이동함.
        int second = 0;
        long result = 0;

        second = YEAR * 24 * 60 * 60; // second = 365 * 하루는 24시간 * 1시간은 60분 * 1분은 60초
        result = (long) second * SPEED;

        System.out.printf("빛은 1초에 %,d km를 이동합니다.\n", SPEED);
        System.out.printf("%d일은 %,d초 이고,\n", YEAR, second);
        System.out.printf("빛이 %d일 동안 이동하는 거리는 %,d km 입니다.\n", YEAR, result);
    }
}