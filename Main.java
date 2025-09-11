// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
       for(int i = 0 ; i <n ; i++){
           arr[i]=sc.nextInt();
           
       }
       System.out.println("original array");
       for(int num : arr)
       System.out.print(num+" ");
       
       int last = n-1, j =0;
      while(j<last){
           int temp = arr[j];
           arr[j]=arr[last];
           arr[last]=temp;
           last--;
       }
        System.out.println("\n Reversed array");
       for(int a : arr)
       System.out.print(a+" ");
    }
}