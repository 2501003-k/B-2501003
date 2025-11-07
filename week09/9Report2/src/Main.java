public class Main {
    public static void main(String[] args) {

        int coin500 = 10;   // 500원짜리 10개
        int coin100 = 10;   // 100원짜리 10개
        int money500 = 500; // 500원짜리 동전
        int money100 = 100; // 100원짜리 동전
        int amount = 0;     // 총 저금액

        int month = (coin500 * money500) + (coin100 * money100); // 한 달 저금액 계산


        for (int i = 1; i <= 12 * 30; i++) { // 30년이면 12개월 * 30으로 총 360번 반복
            amount += month;                 // 즉, 횟수가 정해져 있으므로 for 문이 가장 적합
        }

        System.out.printf("30년 동안의 총 저금액은 %,d원 입니다.\n", amount);
    }
}