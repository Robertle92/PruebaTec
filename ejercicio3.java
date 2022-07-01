import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args){
        int number;

        Scanner textRead = new Scanner(System.in);
        System.out.println("Insert number: ");
        number = Integer.parseInt(textRead.nextLine());
        System.out.println("The result is: \n" + factorial(number));
    }

    public static int factorial(int number) {
        if (number==0)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
