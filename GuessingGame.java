import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) 
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Please input a guess between 1 and a:");
		System.out.println("What will a be?");
		int a=cin.nextInt();
		System.out.println("Okay, lets go!");
		int n=cin.nextInt();
		int random=(int)(1+a*Math.random());
		

		do
		{
			if (n<random)
			{
				System.out.println("Too low, try again!");
			}
			else if (n>random)
			{
				System.out.println("Too high, try again!");
			}
			else if (n==random)
			{
				System.out.println("You got it!");
				System.out.println("Do you want to continue? y/n");
				
				
			}
			n=cin.nextInt();
		}while (true);
	}
}