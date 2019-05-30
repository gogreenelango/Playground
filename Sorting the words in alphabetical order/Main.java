import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    
    
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    String s=sc.nextLine();
    Set<String> hash_Set = new HashSet<String>(); 
    for(int i=0;i<t;i++){
      hash_Set.add(sc.nextLine().toLowerCase()); 
    }
   
      
      
  
      
        Set<String> tree_Set = new TreeSet<String>(hash_Set); 
       for(String stock : tree_Set){
   System.out.println(stock);
}
  }
}