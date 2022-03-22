package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int Number = 13;
		boolean Flag = false;
		for(int i=2; i<=Number/2; i++)
		{
			if(Number%i==0)
		   Flag = true;
		}
			if(Flag == true)
			System.out.println("It is a prime number");
			else
			System.out.println("It is not a prime number");
	}

}
