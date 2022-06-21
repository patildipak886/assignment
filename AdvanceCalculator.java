import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int n1, n2;
		int ans = 1, c = 0;
		int ch;
		
		do
		{
			System.out.println("1. Addition\n 2. Subtraction\n 3.Multiplication\n 4.Division\n e.Exit\n");
			
			System.out.print("Enter Your Choice :");
			ch = s.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter any two Numbers :");
				n1 = s.nextInt();
				n2 = s.nextInt();
				
				c = n1+ n2;
				System.out.println("Addition of "+n1+" and "+n2+" is "+c);
			
			case 2:
				System.out.println("Enter any two Numbers :");
				n1 = s.nextInt();
				n2 = s.nextInt();
				if(n1 > n2)
				{
					c = n1 - n2;
				}
				else
				{
					c = n2 - n1;
				}
				System.out.println("Subtraction of "+n1+" and "+n2+" is "+c);
				
			case 3:
				System.out.println("Enter any two Numbers :");
				n1 = s.nextInt();
				n2 = s.nextInt();
				
				c = n1 * n2;
				System.out.println("Multiplication of "+n1+" and "+n2+" is "+c);
			
			case 4:
				System.out.println("Enter any two Numbers :");
				n1 = s.nextInt();
				n2 = s.nextInt();
				
				if(n2==0)
				{
					System.out.println("Denominater Should not be zero.");
				}
				else
				{
					c = n1/n2;
					System.out.println("Division of "+n1+" and "+n2+" is "+c);
				}
				
				break;
				
			case 5:
				System.exit(0);
				break;
			
			default :
				System.out.println("Wrong Choice...");
			}
			
			System.out.println("Do you want to continue ?(1/0)");
			ans = s.nextInt();
				
		}while(ans != 0);
	}

}
