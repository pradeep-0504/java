import java.util.*;

public class BubbleSort{
    public static void printArray(int arr[]){  //creating function to print the output
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sizee=sc.nextInt();
        int arr[]=new int[sizee];           // declaring the size
        for(int i=0;i<sizee;i++){           // reading the elements from the user
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){    // Time compplexity will be O(N^2)
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];          //logic using temp variable
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);                            //calling the function

    }
}