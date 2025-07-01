import java.util.*;
public class Program4 {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
   
    String[] input = sc.nextLine().split(" ");
     ArrayList<Integer> arr = new ArrayList<Integer>();
     for(String s : input){
        arr.add(Integer.parseInt(s));
    }

    HashMap<Integer,Integer> freq = new LinkedHashMap<>();
    for(int i=1;i<=9;i++){
        freq.put(i,0);
    }

    for(int num : arr){
        for(int i=1;i<=9;i++){
            if(num%i==0){
                freq.put(i,freq.get(i)+1);
                        }
        }
    }


    StringBuilder result = new StringBuilder("{");
    for(int i=1;i<=9;i++){
        result.append(i).append(":").append(freq.get(i));
        if(i!=9){
            result.append(", ");
        }
    }

    System.out.println(result.toString());   
  }
}
