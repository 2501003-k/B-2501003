import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        String[][] customers = new String[][] {{"1111","강성우","1",""}, {"2222","홍길동","2",""}
                , {"3333","문예영","3",""}, {"4444","문예영","4",""}, {"5555","홍길동","4",""}, {"6666","홍길동","5",""}
                , {"7777","문예영","2",""}, {"8888","홍길동","4",""}, {"9999","홍길동","5",""}, {"1010","홍길동","1",""}};
        // {번호, 이름, 타입, 타입 이름}

        int[][] money = new int[customers.length][3]; // {사용금액, 세금, 징수 금액}

        Input.preProcess(customers);

        float[] used = Input.readData(customers); // Input 클래스의 readData에 customers의 값을 넘겨라

        for (int i=0; i< money.length;i++) {
            Compute.pay(money[i], customers[i], used[i]); // 사용 금액 계산
        }

        Compute.tax(customers ,money); // 2차원 호출

        for (int i=0; i < money.length; i++) { // 징수 금액 계산
           Compute.total(money[i]);
        }

        Output.display(customers, money, used); // 출력
    }
}