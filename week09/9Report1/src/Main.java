public class Main {
    public static void main(String[] args) {
        int chicken, dog;


        for (chicken = 0; chicken <= 37; chicken++) { // for
            dog = 37 - chicken;
            if (chicken * 2 + dog * 4 == 102) {
                System.out.printf("for문 ▶ 닭 %d마리, 개 %d마리\n", chicken, dog);
            }
        }


        chicken = 0;
        while (chicken <= 37) { // while
            dog = 37 - chicken;
            if (chicken * 2 + dog * 4 == 102) {
                System.out.printf("while문 ▶ 닭 %d마리, 개 %d마리\n", chicken, dog);
            }
            chicken++;
        }


        chicken = 0;
        do { // do - while
            dog = 37 - chicken;
            if (chicken * 2 + dog * 4 == 102) {
                System.out.printf("do-while문 ▶ 닭 %d마리, 개 %d마리\n", chicken, dog);
            }
            chicken++;
        } while (chicken <= 37);
    }
}