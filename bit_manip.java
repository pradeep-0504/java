import java.util.*;
 public class bit_manip{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitmask=1<<pos;

        if((bitmask & n) == 0){
            System.out.println("Zero bit");
        }
       else{
            System.out.println("One bit");
        }
    }
 }