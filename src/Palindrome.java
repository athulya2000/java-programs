import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String reverse ="";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = s.nextLine();
        int length=input.length();
        for (int i=length-1;i>=0;i--){
            reverse = reverse + input.charAt(i);
        }
        if (input.equals(reverse)) {
            System.out.println("The entered string is palindrome");
        }
        else{
            System.out.println("The entered string is not palindrome");
        }

    }
}
