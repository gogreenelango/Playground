import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int m=n-1;
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      }
      int flag=0;
      for(int i=0;i<n/2;i++){
      if(arr[i]==arr[m--])
        continue;
       else if(arr[i]!=arr[m--]){
        flag=1;
           break;
      }
      }
      if(flag==0) System.out.println("Yes");
      else System.out.println("No");
    }
}