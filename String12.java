package String;

public class String12 {
    // string builder it is used to create one time and we can do modification in it
    // string once it is created we cannot make a modification
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        for(char i='a';i<='z';i++){
            sb.append(i);
        }
        System.out.println(sb + " ");
    }

    
}
