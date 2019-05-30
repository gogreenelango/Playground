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
      int s1=sc.nextInt();
      int s2=sc.nextInt();
     
      for(int j=0;j<s;j++){
      if(s1==arr[j]) System.out.println(j);
        else if(s2==arr[j]) System.out.println(j);
       
      
        
      } if(s2>999) {System.out.println("-1");}
      
      
    }
}