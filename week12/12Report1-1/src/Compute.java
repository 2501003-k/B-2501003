public class Compute {

    static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }


    public static int max4(int num1, int num2, int num3, int num4) {
        int max1 = max(num1, num2);
        int max2 = max(num3, num4);

        return max(max1, max2);

    }
}
