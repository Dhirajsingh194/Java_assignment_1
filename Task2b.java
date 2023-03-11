package Assignment1;

public class Task2b {

	public static void main(String[] args) {
		// storing number in an array of double type
		double[] add= {10,90.78,111,8989,7876};
		double sum=0;
		
		for (int i=0;i<5;i++)
		{
			sum=sum+add[i];
		}
		System.out.println("Sum of 5 number is: "+ sum);
	}

}
