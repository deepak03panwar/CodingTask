import java.util.*;
public class Program1 {
     static double Operations(double x, double y, String operation){
        double result = 0;
        switch(operation){
            case  "Addition":  
               result = x+y;
               break;
            case "Subtraction" : 
               result = x-y;
               break; 
            case "Multiplication" :
               result = x*y;
               break;
            case "Division" :
               result = x/y;
               break;
            default :
            System.out.println("Invalid Operation");
            return Double.NaN;
         }
       return result;
     }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        double a = sc.nextDouble();
        System.out.println("Enter the Second Number:");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Operation You want to Perform:");
        String TypeOfOperation = sc.nextLine();
        double res = Operations(a,b,TypeOfOperation);
        System.out.println(res);
    }

    
}