package String;
import java.util.*;

public class string2 {
    // String next()--> take only one word eg-; hello  ✔  ---> Hello everyone ❌
    // string nextLine() --> takes whole word eg-: hello ✔ --> hello everyone ✔
    public static void main(String args[]){
        // taking user input in string
        Scanner sc=new Scanner(System.in);
        String name = sc.next(); // next()
        sc.nextLine(); 
        String name1 =sc.nextLine();
        System.out.println(name);
        System.out.println( name1);
        
    }
    
}
