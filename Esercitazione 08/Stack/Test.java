import java.util.*;
import java.lang.*;

public class Test{
	public static void main(String[] args){
		int dim = 7;
		Scanner s = new Scanner(System.in);
		Stack<String> stack = new Stack<>(dim);
		boolean r = true;
		
		for(int i = 0; i < dim; i++){
			System.out.print(i+1 + "/" + dim + ": ");
			stack.push(s.nextLine());
			System.out.println();
		}
		
		for(int i = 0; i < stack.size(); i++){
			if(stack.get(i).equals(")(") || stack.get(i).equals("())") || stack.get(i).equals("((()") || stack.get(i).equals("("))
			   r = false;
		}	
		   
	   	System.out.println(r);
		
		s.close();
	}
}
