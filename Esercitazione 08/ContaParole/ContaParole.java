import java.util.*;

public class ContaParole{
	public static void main(String[] args){
		String testo = input();		// Prende l'input da tastiera
		String[] parole = testo.split(" ");	// Divide il testo in singole parole
		
		Map<String, Integer> mappa = new HashMap<>();
		for(String s : parole)
			mappa.put(s.toLowerCase(), null);

		System.out.println(mappa.size());
	}
	
	public static String input(){
		try(Scanner s = new Scanner(System.in)){
			return s.nextLine();
		}
	}
}
