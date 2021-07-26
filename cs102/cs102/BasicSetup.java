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

public class BasicSetup implements IHangmanSetup
{
	private static String[] words = { "Broken", "Magical", "I",
									"JRobo is the best", "amazing",
									"cool", "David", "Incredible" };

	public int getMaxAllowedIncorrectTries()
	{
		return 6;
	}

	public char	getBlankChar()
	{
		return '*';
	}

	public String getCharsToPreserve()
	{
		return " ";
	}

	public String getAllLetters()
	{
		return "abcdefghijklmnopqrstuvwxyz";
	}

	public String chooseSecretWord()
	{
		int random = (int) (Math.random() * words.length );
		return words[ random];
	}
}