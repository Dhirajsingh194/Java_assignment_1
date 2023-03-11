package Assignment1;

public class Task1 {

	public static void main(String[] args) {
		//Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10
				
		int a=10;
		int b=20;
		
		System.out.println("Value of a and b before swapping: "+a + " " + b);
		
		int temp=a; //a value is stored in temp variable
		a=b; 
		b=temp;
		System.out.println("Value of a and b after swapping: "+a + " " + b);
	}

}
