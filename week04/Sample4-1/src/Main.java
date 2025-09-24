public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = -a;
        int c = (((a++) + 2) - (--b));
        // b = b - 1;
        // c = a + 2 - b;
        // a = a + 1;
        int d = (((a--) + (++b)) + 2);
        // b = b + 1; b=-5
        // d = a + b + 2; d=3
        // a = a - 1; a=5

        float e = 5.0f / 4;
        // e = 1.25

        a += 4; // a = a + 4

        System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %.2f\n",a,b,c,d,e);


    }
}