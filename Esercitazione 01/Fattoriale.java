public class Fattoriale {
	public static void main(String[] args) {
		System.out.println(fattoriale(5));
	}
 	static int fattoriale(int n) {
 		if(n <= 1)
 			return 1;
 		else
 			return n * fattoriale(n-1);
 	}
}
