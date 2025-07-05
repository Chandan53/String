package String;
// accessing the character from a string
public class string5 {
    public static void print(String full_name){
        for(int i=0;i<=full_name.length()-1;i++){
            System.out.print(full_name.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String full_name = "chandan kumar";
        print(full_name);
    }
    
}
