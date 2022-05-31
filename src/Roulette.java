import java.util.Random;
import java.util.Scanner;

public class Roulette {
	Scanner scan = new Scanner (System.in);
	Random random = new Random();

	public Roulette() {
		
	}
	
	public double placeBet(double bet) {
		double winnings =0;
		int spin = random.nextInt(37);
		System.out.println("Enter a 1 to bet low (1-18), 2 to bet high (19-36),and 3 to bet on a specific number");
		int x = scan.nextInt();
		while( x > 3 || x <1) {
			System.out.println("READ DIRECTIONS PLEASE");
			System.out.println("Enter a 1 to bet low, 2 to bet high and 3 to bet on a specific number");
			x = scan.nextInt();
		}
		int y = 0;
		if(x==3) {
			System.out.println("pick a number from 1 - 36");
			y = scan.nextInt();
		}
		System.out.println("The number of the spin was: " +spin);
		if(spin >= 19 && spin <= 36 && x == 2) {
			winnings = bet * 2;	
		}
		if(spin >= 1 && spin<= 18 && x == 1) {
			winnings = bet * 2;	
		}
		if(y > 0 &&  y== spin) {
			winnings = bet * 35;	
		}
		
		return winnings;
	}
}
