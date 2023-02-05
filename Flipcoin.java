package briglab3;

import java.util.Random;

public class Flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Random rand = new Random();
			
			int checkRandom=2;
			int intRandom=rand.nextInt(checkRandom);
			
			if(intRandom==1)
			{
				System.out.println("Head");
			}
			else
			{
				System.out.println("Tail");
			}
		}
	
	

}
