import java.util.*;
public class VowelsOrConsonants {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        String vowels=sc.nextLine();
        String input=vowels.toLowerCase();
        switch (input){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Entered character is vowel");
                break;
            default:
                System.out.println("Entered character is consonant");
                break;
        }

    }
}
