import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        triArea(sc.nextInt(), sc.nextInt());
    }
    public static void  triArea(int a, int b ) {
        int с = (a * b)/2 ;
        System.out.println(с);
    }
}