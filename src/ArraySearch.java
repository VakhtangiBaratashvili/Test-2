public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,78,22};
        int number = 1;
        System.out.println(isInArray(arr, number));
    }

    public static boolean isInArray(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}