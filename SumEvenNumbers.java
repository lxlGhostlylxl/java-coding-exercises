public class SumEvenNumbers {
    public static void main(String[] args) {
       System.out.println("Total sum: " + returnSumOfEvensinRange(1, 200)); ;
    }


    public static int returnSumOfEvensinRange(int start, int evensToAdd){
        int sum = 0;
        int index = start;
        int count = 0;

        while(true){
           
            if(isEven(index)){
                System.out.println("Found an even number " + index + " adding to sum!");
                sum += index;;
                count++;
            }
            

            index++;
            if(count >= evensToAdd){
                break;
            }
        }
        return sum;
    }

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
