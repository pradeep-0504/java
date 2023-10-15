import java.util.*;
public class InsertionSort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){      
        int arr[]={7,43,21,12,56,3};

        for(int i=1;i<arr.length;i++){
           int current=arr[i];
            int j=i-1;
            while(j>=0 && (current < arr[j])){          //The time compplexity  is O(N)
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;    // don't confuse here,as we are geetting to this step whenever the valule of j=-1 and always add at the place of arr[0]
        }
        printArray(arr);
    }
}