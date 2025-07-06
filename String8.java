package String;
// Q given a rood containing 4 directions (E,W,N,S)
// find the shortest path to reach Destination
// WNEENESENNN

public class String8 {
    public static float sortestpath(String dir){
        int x=0;
        int y=0;
        for(int i=0;i<dir.length();i++){
            char dire=dir.charAt(i);

            if(dire == 'N'){
                y++;
            }
            else if(dire=='S'){
                y--;
            }
            else if(dire=='W'){
                x--;
            }
            else {
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;

        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String dir = "WNEENESENNN";
        System.out.println(sortestpath(dir));
    }
    
}
