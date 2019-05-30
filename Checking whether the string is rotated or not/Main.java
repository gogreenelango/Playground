import java.util.*;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      
      char arr[]= new char[s1.length()];
      for(int j=0;j<s1.length();j++){
      arr[j]=s1.charAt(j);
      }
      
    
      int flag=0;
      for(int j=0;j<s1.length()-1;j++){
        
        char temp=arr[0];
        for(int h=0;h<s1.length()-1;h++){
                    arr[h] =arr[h+1];
             }
        arr[arr.length-1]=temp;
        
        if(String.valueOf(arr).equals(s2))
        {
        flag=1;
          break;
        }
          
        else flag=0;
        
      }
      
     
      if(flag==1) System.out.println("Yes");
      else System.out.println("No");
      
      
    }
}