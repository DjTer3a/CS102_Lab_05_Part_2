package cs102;
import javax.swing.*;
import java.awt.*;

public class LabelsHangmanView extends JPanel implements IHangmanView{
    
    //PROPERTIES
    Hangman hangman;
    JLabel KnownSoFar;
    JLabel maxTries;
    JLabel triesLeft;
    JLabel mistakes;
    JLabel usedLetters;
    JLabel endGame;

    //CONSTRUCTOR
    public LabelsHangmanView(Hangman hangman){
        this.hangman = hangman;

        setBackground(Color.MAGENTA);

        setLayout(new GridLayout(6,1));
        setPreferredSize(new Dimension(350,350));


        maxTries = new JLabel("Max tries: " + (hangman.getMaxAllowedIncorrectTries()));
        mistakes = new JLabel("Mistakes done: " + (hangman.getNumOfIncorrectTries()));
        triesLeft = new JLabel("Number of tries left: " + (hangman.getMaxAllowedIncorrectTries()-hangman.getNumOfIncorrectTries()));
        usedLetters = new JLabel("Letters used: " + hangman.getUsedLetters());
        KnownSoFar = new JLabel("Secret word: " + hangman.getKnownSoFar());
        endGame = new JLabel();

        maxTries.setFont(new Font("TIMES NEW ROMANS", Font.BOLD, 20)); 
        mistakes.setFont(new Font("TIMES NEW ROMANS", Font.BOLD, 20));
        triesLeft.setFont(new Font("TIMES NEW ROMANS", Font.BOLD, 20));
        usedLetters.setFont(new Font("TIMES NEW ROMANS", Font.BOLD, 20));
        KnownSoFar.setFont(new Font("TIMES NEW ROMANS", Font.BOLD, 20));
        endGame.setFont(new Font("TIMES NEW ROMANS", Font.BOLD, 20));

        add(maxTries);
        add(mistakes);
        add(triesLeft);
        add(usedLetters);
        add(KnownSoFar);
        add(endGame);
    }

    @Override
    public void updateView(Hangman hangman2){
        maxTries.setText("Max tries: " + (hangman2.getMaxAllowedIncorrectTries()));
        mistakes.setText("Mistakes done: " + (hangman2.getNumOfIncorrectTries()));
        triesLeft.setText("Number of tries left: " + (hangman2.getMaxAllowedIncorrectTries()-hangman2.getNumOfIncorrectTries()));
        usedLetters.setText(("Letters used: " + hangman2.getUsedLetters()));
        KnownSoFar.setText("Secret word: " + hangman2.getKnownSoFar());

       if(hangman2.hasLost()){
        endGame.setText("Game over, you lost!!");
       } 
       else if( !hangman2.hasLost() && hangman2.isGameOver()){
        endGame.setText("Game over, you Won!!");
       }
       else{
        endGame.setText("Game Ongoing");
       }
    }
}
