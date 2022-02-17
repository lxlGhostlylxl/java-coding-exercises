public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int num) {
        int row = 0;
        int col = num;
        int index = 0;
        boolean print = false;

        while (true) {
            index = 0;

            if(num < 5){
                break;
            }

            // Keeps up with what part of the line it's on
            for (int i = 0; i < num; i++) {

                // Writes stars depending on line. Breaks line when finished
                if (i < col) {

                    if (row == 0 || row == num) {
                        print = true;
                    } else if (row == 1 || row == num - 1) {

                        if (index < 2 || index >= num - 2) {
                            print = true;
                        }
                    }else{
                        if(isEven(index)){
                            print = true;
                        }
                    }

                    if (print) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    print = false;
                    index++;
                }
            }
            System.out.println();
            row++;

            // Ends Loop
            if (row >= num) {
                break;
            }
        }
    }
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }


}
