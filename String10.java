package String;

public class String10 {
    public static String subset(String word , int si , int ei){
        String sub="";
        for(int i=si;i<ei;i++){
            sub+=word.charAt(i);
        }
        return sub;
    }
    public static void main(String args[]){
        String word ="chandan";
        System.out.println(subset(word,1,5));
    }
    
}
