//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        double temp;
        double result;

        temp = Input.readData(); // call by name
        result = Compute.convert(temp); // call by value
        Output.display(temp, result); // call by value

    }
}