public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) {
            return -1;
        }
        int num1Greatest = 0;
        int num2Greatest = 0;
        int greatestDivisor = 0;
        int index = 1;

        while (true) {
            if (num1 % index == 0) {
                num1Greatest = index;
            }
            if (num2 % index == 0) {
                num2Greatest = index;
            }

            if (num1Greatest == num2Greatest) {
                greatestDivisor = num1Greatest;
            }

            if (index >= num1 || index >= num2) {
                break;
            }
            index++;
        }

        return greatestDivisor;

    }
}
