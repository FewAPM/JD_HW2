package hw2;


public class SumCalculator {
    public static void main(String[] args) {
        System.out.println(new SumCalculator().sum(10));
    }
    public int sum(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Invalid number");
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}