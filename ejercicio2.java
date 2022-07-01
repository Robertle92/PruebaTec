import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args){
        String text = "";

        Scanner textRead = new Scanner(System.in);
        System.out.println("Insert text: ");
        text = textRead.nextLine();
        System.out.println("The inverse text is: \n" + invertText(text));
    }

    public static String invertText(String text){
        String invertedText = "";

        for (int i = text.length() - 1; i >= 0; i--){
            invertedText = invertedText + text.charAt(i);
        }

        return invertedText;
    }

}
