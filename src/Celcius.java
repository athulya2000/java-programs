import java.util.Scanner;

public class Celcius {
    public static void main(String[] args){
        float c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a input temperature value in fahrenheit:");
        float f=s.nextFloat();
        c=((f-32)*5)/9;
        System.out.println("Temperature in degree celcius is:"+c);
    }
}
