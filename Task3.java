package Assignment1;

public class Task3 {

	public static void main(String[] args) {
		// storing number in an array of double type
		double[] add= {10,90.78,111,8989,7876};
		double avg=0;
		
		for (int i=0;i<5;i++)
		{
			avg=(avg+add[i])/5;
		}
		System.out.println("Average of 5 Number is: "+ avg);
	}

}
