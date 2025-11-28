import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
        int first, second;
        int result = 0;

        Output.display(); // call by name
        first = Input.readData("첫번째 데이터 : "); // call by value
        second = Input.readData("두번째 데이터 : ");
        result = Compute.add(first, second); // 실 매개변수 - 실제 값이 있음.
        Output.display(first, second, result);
        Output.display();

//        System.out.print("첫번째 정수 입력 : ");
//        first = keyboard.nextInt();
//        System.out.print("두번째 정수 입력 : ");
//        second = keyboard.nextInt();

//        result = first + second;

//        System.out.printf("%d + %d = %d\n", first, second, result);

    }
}

//    private static void display(int first, int second, int result) { // display는 리턴이 없기 때문에 void로 선언.
//        System.out.printf("%d + %d = %d\n", first, second, result);
//    }
//
//    private static int add(int first, int second) { // first, second = 형식 매개변수 최대 7개 정도 저장 가능
//        int result;
//
//        result = first + second;
//        return result;
//    }
//
//    private static int readData(String msg) { // Method header
//        Scanner keyboard = new Scanner(System.in);
//        int temp;
//        System.out.print(msg);
//        temp = keyboard.nextInt();
//
//        return temp;
//    }
//}