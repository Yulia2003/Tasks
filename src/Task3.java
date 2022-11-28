import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        animals(sc.nextInt(), sc.nextInt(),sc.nextInt());


    }
    public static void animals(int chickens, int cows, int pigs ) {
        int animals = chickens * 2 + cows * 4 + pigs * 4;
        System.out.println(animals);

    }
}