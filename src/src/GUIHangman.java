package src;

import java.awt.*;

import javax.swing.*;

import cs102.*;

/**
 * GUIHangman - GUI based MVC test for cs102 Hangman & IHangmanSetup
 *
 * @author David
 * @version 1.00 2013/4/7
 */

public class GUIHangman
{

	public static void main( String[] args)
	{
		System.out.println( "Start of GUIHangman\n");

		JFrame 				frame;
		HangmanModel		model;
		IHangmanSetup		basicSetup;
		ConsoleHangmanView	consoleView;
		HangmanGUIPanel 	view;

		frame = new JFrame("Hangman GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout( FlowLayout.CENTER, 20, 20));

		


		basicSetup = new BasicSetup();
		model = new HangmanModel( basicSetup);

		consoleView = new ConsoleHangmanView();
		model.addView( consoleView);

		view = new HangmanGUIPanel(model);
		frame.add(view);

		frame.pack();
		frame.setVisible(true);

	}

} // end of class GUIHangman
