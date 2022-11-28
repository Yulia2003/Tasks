import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        abcmath(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
    public static void  abcmath(int a, int b ,int c) {

        for (int i = 1; i < b; i++) {
            a = a + a;
        }

        if( a % c == 0 )
            System.out.println(true);
        else
            System.out.println(false);

    }
}
