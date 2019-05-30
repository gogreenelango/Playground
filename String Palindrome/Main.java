import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String s="";
    for(int i=str1.length()-1;i>=0;i--){
    s+=str1.charAt(i);
    }

      
   if(str1.equals(s))
    System.out.println("Yes");
    else System.out.println("No");
}}