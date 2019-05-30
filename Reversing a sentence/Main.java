import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
      String[] a1=str1.split(" ");
      String a="";
      for(int i=a1.length-1;i>=0;i--){
      a+=a1[i]+" ";
      }
      System.out.println(a);
    }}   
    
