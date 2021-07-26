/**
 * Lab_05_Part_2 Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 26/07/2021
 */


package cs102;
import java.util.Scanner;

// ConsoleControl
// David, 7/4/2013

public class ConsoleControl
{
	public static void controlFor( Hangman hangman)
	{
		Scanner scan = new Scanner( System.in);

		char	letter;

		do
		{
			System.out.print( "Enter letter: ");
			letter = scan.next().charAt(0);

			System.out.println( "found " + hangman.tryThis( letter) + " occurances.");
			System.out.println();

		} while ( true);	// !hangman.isGameOver() );
		
	}
}
