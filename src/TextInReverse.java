
import java.util.Scanner;

public class TextInReverse {

    public static String reverse(String text) {
        String reversedword = "";
        int length = text.length();
        while (length > 0) {
        char helper = text.charAt(length -1);
        reversedword = reversedword + helper;
            length--;
        }
        return reversedword;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
