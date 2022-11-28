import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int temp = remainder(sc.nextInt(), sc.nextInt());
        System.out.println(temp);
    }
    public static int remainder(int a, int b ) {
        int c = a % b ;
        return c;
    }
}