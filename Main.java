import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	System.out.
	  println ("Guess the number between 1 and 100. You have 10 tries.");
	Scanner sc = new Scanner (System.in);
	int num = (int) (Math.random () * 100 + 1);
	int guess = sc.nextInt ();
	for (int i = 1; i <= 10; i++)
	  {
		if (guess == num)
		  {
			System.out.println ("Correct, first try!");
			break;
		  }
		else
		  {
			while (guess != num && i < 10)
			  {
				if (guess > num)
				  {
					System.out.println ("Too High!");
					guess = sc.nextInt ();
					i += 1;
				  }
				else
				  {
					System.out.println ("Too Low!");
					guess = sc.nextInt ();
					i += 1;
				  }
				if (i == 10)
				  {
					System.out.
					  println
					  ("You have used up all your guesses. The correct number was "
					   + num);
					break;
				  }
			  }
			if (guess == num)
			  {
				System.out.println ("Correct, it took you " + i + " tries.");
				break;
			  }
		  }
	  }
  }
}
