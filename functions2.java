import java.util.*;
public class functions2{
    public static int product(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The product of two nums is: " + product(a,b));
    }
}