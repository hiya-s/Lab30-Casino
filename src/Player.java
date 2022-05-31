
public class Player {

	String name;
	double wallet;
	
	public Player (String n, double w) {
		name = n;
		wallet = w;
		
	}
	
	public boolean broke() {
		boolean broke = false;
		if(wallet<= 0)
		{
			broke = true;}
		return broke;
		}
		

}
