import java.util.Scanner;

public class Task8 {
    private static int a;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            nextEdge(sc.nextInt(),sc.nextInt());
        }

    }
    public static void nextEdge(int b, int c ) {
        int a = b + c - 1 ;
        System.out.println(a);

    }

}
