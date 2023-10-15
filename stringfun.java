import java.util.*;
public class stringfun{
    public static void main(String args[]){
        // String one="Tony";
        // String two="Tony";
        Scanner sc=new Scanner(System.in);
        String one=sc.nextLine();
        String two=sc.nextLine();

        if(one.compareTo(two)==0){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}