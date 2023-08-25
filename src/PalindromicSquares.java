public class PalindromicSquares {
    public static void main(String[] args) {
        int n = 1;
        int m = 50;
        int[] result = palindromeArray(n, m);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] palindromeArray(int n, int m) {
        int index = 0;
        int[] result = new int[m - n];
        for (int i = n; i <= m; i++) {
            if (isPalindrome(i) && isPalindrome(i * i)) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }


    public static boolean isPalindrome(int n) {
        String intToString = Integer.toString(n);
        int i = 0;
        int j = intToString.length() - 1;
        while (i < j) {
            if (intToString.charAt(i) != intToString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
