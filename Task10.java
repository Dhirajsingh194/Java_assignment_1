package Assignment1;

public class Task10 {

	public static void main(String[] args) {
		// “Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”
		String[] input= {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for (int i=0;i<5;i++)
		{
			if(input[i]=="Selenium")
			{
				System.out.println("Execution stopped at Selenium");
				break;
				
				
			}
			System.out.println(input[i]);
		}
	}

}
