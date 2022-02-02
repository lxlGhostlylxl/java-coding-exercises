public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int lastDigit = 0;
        int numberHolder = number;

        while (number > 0) {

            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        if (numberHolder == reverse) {
            return true;
        } else {
            return false;
        }

    }
}
