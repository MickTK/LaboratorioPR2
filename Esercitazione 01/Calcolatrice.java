public class Calcolatrice {
	public static void main(String[] args) {
		if (args[1].equals("+"))
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
		else if (args[1].equals("-"))
			System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
		else if (args[1].equals("*")){
			int a = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			System.out.println(a);		
		}
		else if (args[1].equals("/"))
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
		else if (args[1].equals("%"))
			System.out.println(Integer.parseInt(args[0]) % Integer.parseInt(args[2]));
		else if (args[1].equals("^")){
			int a = Integer.parseInt(args[0]);
			for(int i = 0; i < Integer.parseInt(args[2])-1; i++)
				a = a*Integer.parseInt(args[0]);
			if(Integer.parseInt(args[2]) <= 1) 
				a = 1;
			System.out.println(a);
		}	
	}
}
