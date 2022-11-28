import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            operation(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

    }
    public static void operation(int N, int a, int b) {

        if (a + b == N)
            System.out.println("added");
        else if (a-b == N)
            System.out.println("subtraction");
        else if (a*b == N)
            System.out.println("multiplier");
        else if (a/b == N)
            System.out.println("share");
        else
            System.out.println("NONE");
    }
}