//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int a = 0; // 선언문 a를 변수
        float b = 0.0f; // float의 기본값
        long c = 0L; // long의 기본값
        byte d = 0; // byte의 기본값
        short f = 0; // short의 기본값
        boolean t = false; // boolean의 기본값 <false>가 기본값임.
        char g = ' '; // character의 기본값

        final float PI = 3.141592f; // final은 죽어도 못 고친다. Symbolic Constants 기호적 상수
                                    // 상수는 고칠 수 없는 특성을 가지기 때문.
        String Y = null; // String의 기본값
        // String z = new String("");

        a = 5; // 대입문 5를 정수형 리터럴
        b = 5.5f; // 5.5f는 float 리터럴 5.5는 double 리터럴
        c = 5;

        a = (int) 6L; // Cast 연산자: 강제로 () 안에 들어가는 데이터 형으로 뜯어고쳐라.
                        // *데이터에 데이터나 손실이 발생* 하지만 강제로 뜯어고쳐라.
        d = (byte) 128;
        f = (short) 32768; // 왼쪽에는 변수만 올 수 있음.
        a = a + 5;  // 왼쪽은 l-value 오른쪽은 r-value

        // 처리


        // 출력
    }
}