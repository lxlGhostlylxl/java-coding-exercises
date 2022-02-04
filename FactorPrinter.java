public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(-1);
    }

    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
            return;
        }

        String factors = "";
        int index = 1;
        while(true){

            if(number % index == 0){
                factors += index + " ";
            }
            if(index >= number){
                System.out.println(factors);
                break;
            }
            index++;
        }
    }
}
