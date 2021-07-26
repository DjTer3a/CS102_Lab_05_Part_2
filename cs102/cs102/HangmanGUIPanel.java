package cs102;

import java.awt.*;

import javax.swing.JPanel;

public class HangmanGUIPanel extends JPanel{

    //PROPERTIES
    HangmanModel model;
    TextFieldControlPanel text;
    NewGameButtonControl newGameButton;
    LabelsHangmanView view;
    GallowsHangmanView gallows;
    HangmanLetterButtonControls LetterButtons;


    public HangmanGUIPanel(HangmanModel model){
        this.model = model;
        setPreferredSize(new Dimension(750,750));
        setLayout(new BorderLayout());
        setBackground(Color.GREEN);


        text = new TextFieldControlPanel(model);
        add(text, BorderLayout.NORTH);

        

        view = new LabelsHangmanView(model);
        add(view, BorderLayout.WEST);

        gallows = new GallowsHangmanView();
        add(gallows, BorderLayout.CENTER);

        newGameButton = new NewGameButtonControl(model);
        add(newGameButton, BorderLayout.SOUTH);
        
        model.addView(view);
        model.addView(gallows);
        model.addView(newGameButton);
        

        LetterButtons = new HangmanLetterButtonControls(model.getAllLetters());
        LetterButtons.addActionListener(new HangmanLetterButtonsListener(model));

        model.addView(LetterButtons);
        add(LetterButtons, BorderLayout.EAST);


    }
}
