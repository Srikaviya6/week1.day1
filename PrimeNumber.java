package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int Number = 4;
		boolean Flag = true; 
		if(Number == 0 || Number == 1)
		{
			System.out.println("Not a prime Number");
		}
		for(int i=2; i<=Number/2; i++)
		{
			if(Number%i==0)
			{
				System.out.println("It is not a prime number");
		   Flag = false;
		   break;
		}
		}
			if(Flag)
			System.out.println("It is a prime number");
	}

}

 