import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your birth year?");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            
            int age = 2022 - scanner.nextInt();

            if(age > 0 && age <=100){
                scanner.nextLine();

                System.out.println("What is your name?");
                String name = scanner.nextLine();
                System.out.println("Hi my name is " + name + " my age is " + age );
            }else{
                System.out.println("Invaild age");
            }
        }else{
            System.out.println("Invaild data type");
        }

      
        scanner.close();
    }
}
