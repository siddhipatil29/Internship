package Worksheet_B;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo solution = new PowerOfTwo();

        int num1 = 16;
        int num2 = 17;

        System.out.println(num1 + " is power of two: " + solution.isPowerOfTwo(num1));
        System.out.println(num2 + " is power of two: " + solution.isPowerOfTwo(num2));
    }
}
