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

import java.awt.Color;

public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView{

    //CONSTRUCTOR
    public HangmanLetterButtonControls(String LetterButtons){
        super(LetterButtons);
    }
    
    @Override
    public void updateView(Hangman hangman){
        setEnabledAll(true);
        setButtonColor(true);
        setDisabled( hangman.getUsedLetters());

        if( hangman.isGameOver()){
            setEnabledAll(false);
        }
    }
}
