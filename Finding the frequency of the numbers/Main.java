import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
            }
      
       int out[]=new int[k+1];
      for(int i=0;i<k+1;i++){
      out[i]=0;
            }
      
      
       for(int i=0;i<n;i++){
      int y=arr[i];
       out[y]++;
       
       }
      
       for(int i=1;i<k+1;i++){
      System.out.println(i+" "+out[i]);
            }
      
      
      
      
    }
}