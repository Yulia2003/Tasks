import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            profitableGamble(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }

    }



    public static void profitableGamble(float prob, float prize, float pay) {
            System.out.println(prob * prize > pay);



    }
}