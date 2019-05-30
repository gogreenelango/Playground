import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
       Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
      int n=arr_size;
        int arr[] = new int[arr_size];
        for (int index = 0; index < arr_size; index++) 
        {
            arr[index] = sc.nextInt();
        }
      int s=sc.nextInt();
      
      for(int i=0;i<(n-1);i++){
      for(int j=i+1;j<n;j++){
        if(s == arr[i]+arr[j])
        
         System.out.println(arr[i]+", "+arr[j]);
      }
      }
      
    }
}