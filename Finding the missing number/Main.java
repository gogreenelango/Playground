import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      
      int arr[]=new int[n+1];
      arr[0]='$';
      for(int i=1;i<=n;i++){
      arr[i]=sc.nextInt();
        
      }
   
      
      
      int arr2[]=new int[n+1];
      arr2[0]='$';
      for(int i=1;i<n+1;i++){
      arr2[i]=0;
      }

       for(int i=1;i<=n;i++){
             int flag=arr[i];
              arr2[flag]++;
            
       }
      
       for(int i=1;i<=n;i++){
          
            if(arr2[i]==0){
              System.out.println(i);}
            
       }
      
      
          
      
       
    }
}