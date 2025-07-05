package String;

public class string1 {
    // String are IMMUTABLE --> ones created cannot be change
    public static void main(String args[]){
        // two methot to create a String4
        String srt =("abcd");
        String srt1=new String ("xys");
        // character array 
        char arr[] = {'a','b','c','d','e'};

        System.out.println(srt);
        System.out.println(srt1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
