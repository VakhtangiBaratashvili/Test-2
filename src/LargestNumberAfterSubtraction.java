import java.util.Scanner;

public class LargestNumberAfterSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        String number = scanner.next();

        System.out.print("Enter the number of digits to subtract: ");
        int k = scanner.nextInt();

        if (k >= number.length()) {
            System.out.println("After subtracting " + k + " digits, the number becomes 0.");
        } else {
            String result = subtractKDigits(number, k);
            System.out.println("The largest number after subtracting " + k + " digits: " + result);
        }
    }

    public static String subtractKDigits(String number, int k) {
        String result = "";

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            while (k > 0 && result.length() > 0 && result.charAt(result.length() - 1) < digit) {
                result = result.substring(0, result.length() - 1);
                k--;
            }
            result += digit;
        }

        while (k > 0 && result.length() > 0) {
            result = result.substring(0, result.length() - 1);
            k--;
        }

        int start = 0;
        while (start < result.length() - 1 && result.charAt(start) == '0') {
            start++;
        }

        return result.substring(start);
    }
}
