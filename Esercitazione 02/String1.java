class String1{
	public static void main(String[] args){
		
		for(int i = 0; i < args.length; i++){
			System.out.print(args[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < args.length; i++){
			args[i] = args[i].replace('i', '!').replace('s', '$');
			System.out.print(args[i] + " ");
		}
		System.out.println();
	}
}
