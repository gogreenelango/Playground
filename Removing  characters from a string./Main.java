import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
		 String s=sc.nextLine();
		    String s2=sc.nextLine();
     ArrayList<Character> al3 = new ArrayList<>();

		    ArrayList<Character> a= new ArrayList<Character>();
		    for(int i=0;i<s.length();i++){
			      al3.add((char)(s.charAt(i)));
			    
			    }
		    for(int i=0;i<s2.length();i++){
			      a.add((char)(s2.charAt(i)));
			    
			    }
	        for(int i = 0; i < a.size(); i++) {
	            for(int j = 0; j < al3.size(); j++) {
	                if(a.get(i).equals(al3.get(j))){
	                    al3.remove(j);
	                    j--;
	                }
	            }
	        }
		    
		    
				
				String h1="";
				for(Character h2:al3) {
					
					h1+=h2;
				}
		    System.out.println(h1); 
  }
}