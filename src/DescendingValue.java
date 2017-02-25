import java.util.Scanner;

public class DescendingValue {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.print("Enter Value: ");
		a = input.nextInt();
		
		System.out.print("Enter Value: ");
		b = input.nextInt();
		
		System.out.print("Enter Value: ");
		c = input.nextInt();
		
		if (a < b && a < c)
		{
			if (b < c)
			{
			System.out.println("Values in descending are: " + c + "," + b + "," + a);
			}
			else
			{
			System.out.println("Values in descending are: " + b + "," + c + "," + a);	
			}
			
		}
		else if (b < a && b < c)
		{
			if (a < c)
			{
			System.out.print("Values in descending are: " + c + "," + a + "," + b);
			}
			else 
			{
			System.out.print("Values in descending are: " + a + "," + c + "," + b);
			}
		}
		
		else {
			if (a < c)
			{
			System.out.print("Values in descending are: " + b + "," + a + "," + c);	
			}
			else
			{
				System.out.print("Values in descending are: " + a + "," + b + "," + c);		
			}
		}
			 
				
		input.close();

	}

}