
public class Main {
    public static void main(String[] args) {

        final int SECOND = 54321; // 입력초
        final int HOUR = 3600; // 1시간 = 3600초
        final int MINUTE = 60; // 1분 = 60초

        int hour2 = 0;
        int minute2 = 0;
        int second2 = 0;
        int remain = 0;


        hour2 = SECOND / HOUR; // 54321 / 3600 = 15
        remain = SECOND % HOUR; // 위에 값을 계산한 후 남은 초값 받아오기
        minute2 = remain / MINUTE; // 남은 초에서 60을 나눈값이 분
        second2 = remain % MINUTE; // 남은 초에서 60을 나눈 후 남은 값이 초


        System.out.printf("%d 초 = %d 시간 %d 분 %d 초\n", SECOND, hour2, minute2, second2);
    }
}