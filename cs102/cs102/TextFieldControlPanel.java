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

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextFieldControlPanel extends JPanel implements ActionListener{
    
    //PROPERTIES
    Hangman hangman;
    JTextField text;
    JLabel label;

    //CONSTRUCTOR
    public TextFieldControlPanel(Hangman hangman){
        this.hangman = hangman;
        text = new JTextField(6);
        label = new JLabel("Enter a letter of your choice :- ");
        label.setFont(new Font("TIMES NEW ROMANS", Font.BOLD, 20));

        add(label);
        add(text);

        text.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        for (int i =0; i < (text.getText()).length(); i++){
            hangman.tryThis(text.getText().charAt(i));
        }

        text.setText("");
    }
}
