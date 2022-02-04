public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(8));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int index = 1;
        int sum = 0;
        while (true) {

            if (number % index == 0) {
                sum += index;
            }

            index++;
            if (index > (number / 2)) {
                break;
            }

        }

        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

}
