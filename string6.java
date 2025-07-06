package String;

public class string6 {
    // palindrome --> it is a word that when we read from the start is same as when we read from the end
    // eg ;- r a c e c a r , n o o n, m a d a m
    public static boolean palindrome(String str){
        int n=str.length();
        for(int i=0; i<str.length()/2;i++){
            
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;

            }
            

        }
        return true;
        
    }
    public static void main(String args[]){
        String str="racecar";
        System.out.println(palindrome(str));
    }
    
}
