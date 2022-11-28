public class Task9 {
    private static int sumOfCubes;

    public static void main(String[] args) {
        int [] m = {1, 2, 3};
        sumOfCubes(m);

    }
    public static void sumOfCubes(int[] m ){
        int sum = 0;
        for(int i =0; i<m.length; i++){

             sum += Math.pow(m[i], 3);

        }
    System.out.println((sum));
    }

}


