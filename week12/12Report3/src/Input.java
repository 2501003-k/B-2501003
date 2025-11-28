import java.util.Scanner;

public class Input {
    public static long readData(String msg) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(msg);
        return keyboard.nextLong();
    }
}
