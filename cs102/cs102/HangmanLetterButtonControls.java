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
