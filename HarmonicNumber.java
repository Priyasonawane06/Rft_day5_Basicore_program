package briglab3;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number that you want to print the Harmonic Number");
		int harmonicNumber = scan.nextInt();
		for(int counter=1;counter<=harmonicNumber;counter++)
		{
			System.out.println("1/"+counter);
		}

	}

}
