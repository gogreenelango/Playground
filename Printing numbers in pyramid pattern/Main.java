import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      int count=1;
		for(int row_no = 1 ; row_no <= n ; row_no++){
			for(int space = 1 ; space <= (n-row_no) ; space++ ) {
				System.out.print(" ");
			}
			for(int col_no = 1 ; col_no <= row_no ; col_no++){
				System.out.print(count+" ");count++;
			}
			System.out.print("\n");		
          
		}
    }    
}