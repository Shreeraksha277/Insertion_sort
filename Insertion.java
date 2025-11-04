import java.util.*;

public class Insertion {
          public static void print_array(int arr[], int n)
          {
            for (int i = 0; i < n; i++) 
              {
                 System.out.print(arr[i] + " "); 
              }
            System.out.println();
         }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];   
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
          {  
            arr[i] = sc.nextInt();
          }
      for(int i=1;i<arr.length;i++)
        {
          int current =arr[i];
          int j=i-1;
          while(j>=0 && current<arr[j])
          {
            arr[j+1] = arr[j];;
            j--;
          }
        arr[j+1] = current; 
      }
    print_array(arr, n);
   }
} 
