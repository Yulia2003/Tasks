import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ctoa(sc.next().charAt(0));
        }

    }
    public static void ctoa(char c) {
        int ctoa =  c;
        System.out.println(ctoa);



    }

}
