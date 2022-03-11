import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birth year?");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hi my name is " + name + " and I was born in " + yearOfBirth);
    }
}
