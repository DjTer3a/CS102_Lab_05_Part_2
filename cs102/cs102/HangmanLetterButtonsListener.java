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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class HangmanLetterButtonsListener implements ActionListener{
    //PROPERTIES
    HangmanModel model;
    int mistakes;

    public HangmanLetterButtonsListener(HangmanModel model){
        this.model = model;
        mistakes = 1;
    }

    public void actionPerformed(ActionEvent e){
        model.tryThis(e.getActionCommand().charAt(0));

        if(mistakes == model.getNumOfIncorrectTries()){
            ((JButton)e.getSource()).setBackground(Color.yellow);
            mistakes++;
        }
        else{
            ((JButton)e.getSource()).setBackground(Color.green);
        }

        if(!model.isGameOver()){
            ((JButton) e.getSource()).setEnabled(false);
            
        }
        else{
            mistakes = 1;
            if(model.hasLost()){
                ((JButton) e.getSource()).setBackground(Color.RED);
            }
            else{
                ((JButton) e.getSource()).setBackground(Color.GREEN);
            }
        }
    }
}
