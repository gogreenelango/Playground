import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    
    
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    
    String[] words = s.split(" ");
        
        String reverseString = "";
        
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            
            String reverseWord = "";
            
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            
            reverseString = reverseString + reverseWord + " ";
        }
        
        
        
        System.out.println(reverseString);
        
       
    }
  }
