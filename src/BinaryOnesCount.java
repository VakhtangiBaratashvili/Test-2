public class BinaryOnesCount {
    public static void main(String[] args) {
        int decimal = 9;
        System.out.println(onesCounter(decimal));
    }

    public static int onesCounter(int n) {
        int count = 0;
        String binary = convertToBinary(n);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal /= 2;
        }

        return binary;
    }
}
