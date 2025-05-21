
import java.util.Scanner;//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력 : ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력 : ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y  : " + result);
        System.out.println();

        while(true){
            System.out.printf("입력 문자열 : ");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열 : " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}