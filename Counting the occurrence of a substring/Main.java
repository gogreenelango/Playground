import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String s=scan.nextLine();
    char c=s.charAt(0);
    int count=0;
    for(int i=1;i<str1.length();i++){
    if(c==str1.charAt(i)){
      System.out.println(i);
        break;
    }
    }
    
  } 
}