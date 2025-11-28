public class Compute {
    public static boolean leapYear(int year) {

        if (year % 400 == 0) { // 400으로 나누어 떨어지면 윤년
            return true;
        } else if (year % 100 == 0) { // 100으로 나누어 떨어지면 평년
            return false;
        } else if (year % 4 == 0) { // 4로 나누어 떨어지면 윤년
            return true;
        } else {                   // 그렇지 않으면 모두 평년
            return false;
        }
    }
}
