// Dylan Nelson
// February 11, 2025
// Recursion.java

public class Recursion {

    public static int ProductRecursion(int resultN, int N) {

        if (N == 0) {
            System.out.println(resultN);
        }
        else {
            resultN = resultN + N;
            System.out.print("Iterations left = " + N);
            System.out.println(" | Result = " + resultN);
            ProductRecursion(resultN, N-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        
        int startValue = 0;
        int iterations = 5;

        ProductRecursion(startValue, iterations);
    }
}

