package cs102;

import java.awt.*;

import javax.swing.JPanel;

public class HangmanGUIPanel extends JPanel{

    //PROPERTIES
    HangmanModel model;
    TextFieldControlPanel text;
    NewGameButtonControl newGameButton;

    public HangmanGUIPanel(HangmanModel model){
        this.model = model;
        setPreferredSize(new Dimension(800,800));
        setLayout(new BorderLayout());
        setBackground(Color.GREEN);


        text = new TextFieldControlPanel(model);
        add(text, BorderLayout.NORTH);

        newGameButton = new NewGameButtonControl(model);
        add(newGameButton, BorderLayout.SOUTH);


        model.addView(newGameButton);

    }
}
