package briglab3;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enetr the element"+args[0]);
		int table=Integer.parseInt(args[0]);
		for(int counter=1;counter<=table;counter++)
		{
			int mult=2*counter;
			System.out.println("2 * "+counter+"= "+mult);
		}
	}

	}


