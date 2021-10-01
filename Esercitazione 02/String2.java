class String2{
	public static void main(String[] args){
		
		if(args[0].toUpperCase().matches(args[1].toUpperCase())){
			System.out.println(args[0] + " " + args[1]);
			System.out.println("Le stringhe sono uguali");
		}
		else{
			System.out.println(args[0] + " " + args[1]);
			if(args[0].compareToIgnoreCase(args[1]) < 0)
				System.out.println(args[0] + " precede " + args[1]);
			else
				System.out.println(args[1] + " precede " + args[0]);
		}
	}
}
