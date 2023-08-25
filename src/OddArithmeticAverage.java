public class OddArithmeticAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(oddAverage(arr));
    }

    public static double oddAverage(int[] arr) {
        int oddCount = 0;
        int oddSum = 0;

        for (int i : arr) {
            if (i % 2 == 1) {
                oddSum += i;
                oddCount++;
            }
        }
        return (double) oddSum / oddCount;
    }
}
