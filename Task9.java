package Assignment1;

public class Task9 {

	public static void main(String[] args) {
		// 12,34,66,85,900
		int[] number= {12,34,66,85,900};
		
		for (int i=0;i<5;i++)
		{
			if(number[i]==85)
			{
				System.out.println("Execution stopped at 85");
				break;
				
				
			}
			System.out.println(number[i]);
		}
	}

}
