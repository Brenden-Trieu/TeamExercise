package code;

public class arrSum {
    public static int sumVal(int[] input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }
}
