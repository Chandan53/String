package String;

public class String9 {
    // in string if we want to check that first_string is equal to second_string in that case we will not use 
    // firet_string == second_string we will use equals function
    // first_string.equals(second_string)
    public static void main(String args[]){
        String s1="chandan";
        String s2="chandan";
        String s3 = new String ("chandan");

       // it is because we have already hade a name chandan
        if(s1==s2){
            System.out.println("String is equal");

        }
        else {
            System.out.println( "string is not equal");
        }

        // it is because we have created a new String
        if(s1==s3){
            System.out.println("string is equal");
        }
        else {
            System.out.println("string is not equal");
        }
        // it is now equal because we have use equals()
        if(s1.equals(s3)){
            System.out.println("string value are same");
        
    }
    else {
        System.out.println( " not same");
    }
    }


    
    
}
