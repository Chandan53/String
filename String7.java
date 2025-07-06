package String;

public class String7 {
    public static boolean isnotpalindrome(String word){
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String word="chandan";
        System.out.println(isnotpalindrome(word));
    }
    
}
