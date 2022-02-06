public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(-2521);
        System.out.println(reverse(-2521));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);

        for (int i = 0; i < digitCount; i++) {
            switch (reversedNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;

                default:
                    System.out.println("Invalid number");
                    break;
            }
            reversedNumber /= 10;
        }

    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (true) {
            reversedNumber += number % 10;
            number /= 10;
            reversedNumber *= 10;
            if (number == 0) {
                reversedNumber /= 10;
                return reversedNumber;
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        while (true) {
            count++;
            number /= 10;

            if (number < 1) {
                return count;
            }
        }

    }

}
