import java.util.Scanner;
class Recursion{
    public static int fibo(int n){
        if(n==0) {
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-2)+fibo(n-1);

    }
}

public class FibonacciSeries {
    public static void main(String[] args){
        Recursion r=new Recursion();
        Scanner s=new Scanner(System.in);
        System.out.println("Fibonacci series upto");
        int num=s.nextInt();
        for(int i=0;i<num;i++){
            System.out.print(r.fibo(i)+",");
        }
    }
}
