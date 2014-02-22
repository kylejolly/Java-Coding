package labex2;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;
import javax.swing.*;

public class ShuffleGui extends Frame implements ActionListener
{
    public Button btnShuffle; //shuffle button
    public Button btnExit;//exit button
    //tfCardeFaceValue# sets the textfields for the face values
    private final TextField tfCardFaceValue1 = new TextField(5);
    private final TextField tfCardFaceValue2 = new TextField(5);
    private final TextField tfCardFaceValue3 = new TextField(5);
    private final TextField tfCardFaceValue4 = new TextField(5);
    private final TextField tfCardFaceValue5 = new TextField(5);
    
    //tfCardSuit# sets the textfields for the suits
    private final TextField tfCardSuit1 = new TextField(8);
    private final TextField tfCardSuit2 = new TextField(8);
    private final TextField tfCardSuit3 = new TextField(8);
    private final TextField tfCardSuit4 = new TextField(8);
    private final TextField tfCardSuit5 = new TextField(8);
    
    private  TextField tfPlayers = new TextField(2);
    
    
    public ShuffleGui()
    {
        int iCounter=0;
        while(iCounter == 0)
        {
        String s = (String)JOptionPane.showInputDialog(
            null,"How many players?","Player Amount Input",
            JOptionPane.PLAIN_MESSAGE,null,null,"1");
            switch(s)
            {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
                    tfPlayers.setText(s);
                    iCounter++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Please choose a number between 1 and 10", "Error", 
                            JOptionPane.ERROR_MESSAGE) ;
                    break;
            }
        }
        //title and layout of the gui window
        setTitle ("Shuffler");
        setLayout ( new FlowLayout( ));
        setResizable(false);
        //adds some title stuff 
        add(new Label("Poker Hand Deck Shuffler"));
        add(new Label("and Dealer v0.3"));
        add(new Label("                                    "));
        add(new Label("              Your cards:                "));
        //each clump sets up the look of the gui 
        add(tfCardFaceValue1);
        add(new Label("  of  "));
        add(tfCardSuit1);
        
        add(tfCardFaceValue2);
        add(new Label("  of  "));
        add(tfCardSuit2);
        
        add(tfCardFaceValue3);
        add(new Label("  of  "));
        add(tfCardSuit3);
        
        add(tfCardFaceValue4);
        add(new Label("  of  "));
        add(tfCardSuit4);
        
        add(tfCardFaceValue5);
        add(new Label("  of  "));
        add(tfCardSuit5);
        add(new Label("Programmed by: Kyle Jolicoeur"));
        
        add(new Label("   "));
        btnShuffle = new Button("Shuffle"); //shuffle button
        add(btnShuffle);
        btnShuffle.addActionListener(new ButtonHandler(this));
        add(new Label("   "));

        btnExit = new Button("Exit");//exit button
        add(btnExit);
        btnExit.addActionListener(new Button2Handler(this));
        add(new Label("   "));
        
        add(tfPlayers);
        add(new Label("  players"));
        
        addWindowListener( new CloseWindow( ));        
    }
    class ButtonHandler implements ActionListener
    {
        ShuffleGui f;
        ButtonHandler(ShuffleGui pf)
        { f = pf;}
        public void actionPerformed (ActionEvent event)
        {
              f.shuffleMethod( );
              f.repaint( );
        }
    }
    class Button2Handler implements ActionListener
    {
        ShuffleGui f;
        Button2Handler(ShuffleGui pf)
        { f = pf;}
        public void actionPerformed (ActionEvent event)
        {
              f.exitMethod( );
              f.repaint( );
        }
    }
    void shuffleMethod( )
    {
        Deck deck1 = new Deck();
        Stack randDeck;
        randDeck= (Stack) deck1.shuffleDeck();
        
        Card temp1 = (Card)randDeck.pop();
        temp1.setFaceValue(temp1.checkFaceValue());
        tfCardFaceValue1.setText(temp1.getFaceValue());
        tfCardSuit1.setText(temp1.getSuit());
        
        Card temp2 = (Card)randDeck.pop();
        temp2.setFaceValue(temp2.checkFaceValue());
        tfCardFaceValue2.setText(temp2.getFaceValue()); 
        tfCardSuit2.setText(temp2.getSuit());
        
        Card temp3 = (Card)randDeck.pop();
        temp3.setFaceValue(temp3.checkFaceValue());
        tfCardFaceValue3.setText(temp3.getFaceValue());
        tfCardSuit3.setText(temp3.getSuit());
        
        Card temp4 = (Card)randDeck.pop();
        temp4.setFaceValue(temp4.checkFaceValue());
        tfCardFaceValue4.setText(temp4.getFaceValue());
        tfCardSuit4.setText(temp4.getSuit());
        
        Card temp5 = (Card)randDeck.pop();
        temp5.setFaceValue(temp5.checkFaceValue());
        tfCardFaceValue5.setText(temp5.getFaceValue());
        tfCardSuit5.setText(temp5.getSuit());
    }
     void exitMethod( )
    {
        System.exit(0);
    }
    public void actionPerformed (ActionEvent event)
    {
        repaint( );
    }
    public class CloseWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}