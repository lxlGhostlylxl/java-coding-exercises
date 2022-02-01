public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(12));
    }

    public static int sumDigits(int num) {
        int sum = 0;
        int n = num;

        if (num < 10) {
            return -1;
        }

        while (num > 0) {
            // Add sums

            n = num % 10;
            sum += n;
            num = num / 10;

        }

        return sum;

    }
}
