import java.util.Random;
import java.util.Arrays;

class DiceSimulator{
	public static void main(String[] args){
	Random generator = new Random();
	int[] lanci = new int[3];
	
	
	lanci[0] = generator.nextInt(6)+1;
	lanci[1] = generator.nextInt(6)+1;
	lanci[2] = generator.nextInt(6)+1;
	
	System.out.println(Arrays.toString(lanci));
	}
}
