public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int num){
        int row = 0;
        int col = num;
        int index = 0;

        while(true){
          for(int i = 0; i < num; i++){
              if(i < col){
                  System.out.print("*");
              }else{
                  System.out.println();
              }
          }
          break;
        }
    }
}
