package Assignment1;

public class Task8 {

	public static void main(String[] args) {
		// 78,12,89,55,35
		int[] marks= {78,12,89,55,35};
		
		for(int i=0;i<5;i++)
		{
			if(marks[i]>80)
			{
				System.out.println("Student who has scored more than 80 is:"+marks[i]);
			}
		}

	}

}
