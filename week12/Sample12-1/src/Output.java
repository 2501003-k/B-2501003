public class Output {

    // Method Overload (중복 정의)
    static void display(int first, int second, int result) { // display는 리턴이 없기 때문에 void로 선언.
        System.out.printf("%d + %d = %d\n", first, second, result);
    }
    static void display(int first, int second) { // display는 리턴이 없기 때문에 void로 선언.
        System.out.printf("%d + %d = %d\n", first, second);
    }


    static void display() {
        System.out.println("******************************");
    }
}
