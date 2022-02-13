public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int num){
        int row = 0;
        int col = num;
        int index = 0;

        while(true){
            //Keeps up with what part of the line it's on
          for(int i = 0; i < num; i++){
              
            //Writes stars depending on line.  Breaks line when finished
              if(i < col){
                  System.out.print("*");
              }         
          }
          System.out.println();
          row++;

          //Ends Loop
          if(row > num){
              break;
          }
        }
    }
}
