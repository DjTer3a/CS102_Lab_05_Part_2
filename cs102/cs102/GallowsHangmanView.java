package cs102;
import javax.swing.*;
import java.awt.*;

public class GallowsHangmanView extends JPanel implements IHangmanView{
    
    //PROPERTIES
    HangmanModel model;
    
    //CONSTRUCTOR
    public GallowsHangmanView(){
        setBackground(Color.CYAN);
        setLayout(new BorderLayout());
    }

    public void paintComponent(Graphics g){
      super.paintComponent(g);

      g.setColor(Color.GRAY);

        
      g.fillRect(20, 420, 69, 20); 
      
      g.fillRect(40, 210, 20, 210); 
      
      g.fillRect(40, 210, 100, 20);
      
      g.fillRect(135, 210, 10, 60); 
      
      
      
      if( model.getNumOfIncorrectTries() > 0) 
      {
         g.drawOval(120, 270, 40, 40);
      }
      
      if(model.getNumOfIncorrectTries() > 1) 
      {
         g.drawLine(135,310,135,395);
      }
      
      if(model.getNumOfIncorrectTries() > 2) 
      {
         g.drawLine(135,395,120,420);
      }
      
      if(model.getNumOfIncorrectTries() > 3) 
      {
         g.drawLine(135,395,150,420);
      }
      
      if(model.getNumOfIncorrectTries() > 4) 
      {
         g.drawLine(135,350,140,370);
      }
      
      if(model.getNumOfIncorrectTries() > 5) 
      {
         g.drawLine(135,350,130,370);
      }
    }

    @Override
    public void updateView(Hangman hangman){
        model = (HangmanModel)hangman;
        repaint();
    }
}
