import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = func(sc.nextInt(), sc.nextInt());
        System.out.print(temp);
    }
    public static int func(int a, int b ) {
        int result = 1;
        for(int i = 0; i< b; i++)
            result *= a;

        return result;

    }
}