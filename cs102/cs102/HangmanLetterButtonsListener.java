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
            ((JButton) e.getSource()).setBackground(Color.RED);
        }
    }
}
