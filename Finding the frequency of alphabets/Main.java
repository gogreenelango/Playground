import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String s=sc.nextLine().toLowerCase();
      StringBuilder sb = new StringBuilder(s);
      int arr[] = new int[26];
      for(int i=0;i<26;i++){
      arr[i]=0;
      }
      for(int i=0;i<s.length();i++){
      if(s.charAt(i)>='a' && s.charAt(i)<='z'){
      int v=s.charAt(i)-'a';
        arr[v]++;
      }
      
      }
      
      for(int j=0;j<s.length();j++){
      int v1=s.charAt(j)-'a';
        char c=(char)(v1+'a');
        if(arr[v1]!=0){
           System.out.print(c+""+arr[v1]+" ");
          arr[v1]=0;
        
        
      }
      
    }
}}