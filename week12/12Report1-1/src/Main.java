//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int num1 = Input.readData("정수 1 입력: ");
        int num2 = Input.readData("정수 2 입력: ");
        int num3 = Input.readData("정수 3 입력: ");
        int num4 = Input.readData("정수 4 입력: ");

        int result = Compute.max4(num1, num2, num3 ,num4);

        Output.display(result);
    }
}