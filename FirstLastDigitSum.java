public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int firstDigit = number % 10;
        int lastDigit = 0;
       // System.out.println(firstDigit);

        while (true) {
            if(number < 10){
                lastDigit = number;
                sum = firstDigit + lastDigit;
                break;
            }

            if (number < 99) {
                lastDigit = number / 10;
                System.out.println(lastDigit);
                sum = firstDigit + lastDigit;
                break;
            }
            number /= 10;

        }

        return sum;

    }
}
