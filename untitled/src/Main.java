//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        /*
        isInfinite 와 isNaN
         */
        int x = 5;
        double y = 0.0;
        double z =  x / y;
        //int result = 5 / 0; 예외 발생
        System.out.println(z + 2);

        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }

    }
}