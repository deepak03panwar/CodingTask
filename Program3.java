import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            n=n-1;
        }

        for(int i=1;i<=n;i++){
           System.out.print( (2*i)-1);
           if(i!=n){
            System.out.print(", ");
           }
        }
    }
}

