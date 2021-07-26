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
    }

    @Override
    public void updateView(Hangman hangman){
        if( model.isGameOver()){
            setEnabled(true);
        }
    }

    
}
