//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
       int x = 10;
       int y = 10;
       int z;

       x++;
       ++x;
        System.out.println("x = " + x);

        System.out.println("================");
        y--;
        --y;

        System.out.println("y = " + y);
        System.out.println("================");
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("================");
        z = ++x;
        System.out.println("z ="  + z);
        System.out.println("x = " + x);

        System.out.println("================");
        z = ++x + y++;
        System.out.println("z = " +  z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}