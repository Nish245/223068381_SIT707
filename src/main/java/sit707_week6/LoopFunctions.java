package sit707_week6;

public class LoopFunctions {

    // Function with a simple conditional loop
    public static int sumFirstN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Function with a loop that includes a conditional statement
    public static int countEvenNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
