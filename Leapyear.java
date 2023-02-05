package briglab3;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sobj = new Scanner(System.in);
			System.out.println("Enter the year that you want to check that is leap year or not");
			int year = sobj.nextInt();
			boolean leap = false;
			
			if((year % 4) == 0 )
			{
				if((year % 100) == 0)
				{
					if((year % 400) == 0)
					{
						leap=true;
					}
					else
					{
						leap=false;
					}
				}
				else{
					leap=true;
				}
				
			}
			else
			{
				leap=false;
			}
			if(leap == true)
			{
				System.out.println(year+" is a leap year");
			}
			else
			{
				System.out.println(year+" is not a leap year");
			}
		}
	}
	


