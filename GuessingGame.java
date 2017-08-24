import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) 
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Please guess a number between 1 and 100:");
		int n=cin.nextInt();
		int a=1;
		int b=100;
		int random=(int)(a+b*Math.random());
		
		while (true)
		{
			if (n<random)
			{
				System.out.println("Too low!");
			}
			else if (n>random)
			{
				System.out.println("Too high!");
			}
			else if (n==random)
			{
				System.out.println("You got it!");
			}
		}
		//cin.close();
	}

}