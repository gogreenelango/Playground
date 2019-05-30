import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner sc = new Scanner(System.in);
      int s=sc.nextInt();
      int[] arr = new int[s];
      for(int i=0;i<s;i++){
      arr[i]=sc.nextInt();
      }
      
      
      
      int temp=arr[0];
      for(int j=0;j<s;j++){
      if(temp<arr[j]){
      temp=arr[j];
      }
          
      }
     
      System.out.println(temp);
    }
}