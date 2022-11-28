import java.util.Scanner;

public class Task7 {
    private static int sum;

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            addUpTo(sc.nextInt());
        }

    }
    public static void addUpTo(int c) {
        for(int i = c; i != 0; i--){
            sum += i;


        }
        System.out.println(sum);


    }

}
