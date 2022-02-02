public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(32, 12));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) {
            return false;
        }

        if(num1 % 10 == num2 % 10){
            return true;
        }else if(num1/10 == num2/10){
            return true;
        }else if(num1 % 10 == num2 / 10){
            return true;
        }else if (num2 % 10 == num1 / 10){
            return true;
        }else{
            return false;
        }

    }
}
