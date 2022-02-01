public class SumOddNumbers {
    public static boolean isOdd(int n){
        if(n < 1){
            return false;
        }else{
            if(n % 2 == 0){
                return false;
            }else{
                return true;
            }
        }
    }
    
    public static int sumOdd(int start, int end){
        int sum = 0;
        
         if(start > end || start < 0 || end < 0){
            return -1;
        }
    
        for(int i = start; i < (end + 1); i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
    
}
