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
import java.awt.event.*;


public class NewGameButtonControl extends JButton implements ActionListener, IHangmanView{
    //PROPERTIES
    HangmanModel model;
    
    //CONSTRUCTOR
    public NewGameButtonControl(HangmanModel model){

        super("Press to start a New Game");
        this.model = model;

        setEnabled(false);

        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        model.initNewGame();
        setEnabled(false);
        setText("Enter anything into textfield");
    }

    @Override
    public void updateView(Hangman hangman){
        if( model.isGameOver()){
            setEnabled(true);
            setText("Press to start a New Game");
        }
    }

    
}
