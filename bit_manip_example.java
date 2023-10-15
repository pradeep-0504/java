import java.util.*;
public class bit_manip_example{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        //oper=1 set
        //oper=0 clear
        int n=5;
        int pos=1;
        int maskbit=1<<pos;

        if(oper==1){
            int newnum= n | maskbit;
            System.out.println(newnum);
        }
        else {
        int newbitmask= ~(maskbit);
        int newnum= n & newbitmask;
        System.out.println(newnum);
        }
    }

}