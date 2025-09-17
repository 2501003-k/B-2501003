//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        short test1 = 127;
        short test2 = 45;

        short result = (short) (test1 + test2); // 기본적으로 정수형은 int로 출력 되는데 short는 int 보다 좁은 범위라 자동 변환이 불가능
        result = (short) (3.0 + 3.5); // 정수형 : byte = 8비트 / short = 16비트 / int = 32비트 (기본형) / long = 64비트
                                      // 실수형 : float = 32비트 / double = 64비트 (기본형)

        System.out.printf("%d + %d = %d\n",test1,test2,result);



    }
}