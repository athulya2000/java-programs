import java.util.*;

public class Triangle {
    public static void main(String[] args){
        int i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the input number:");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
