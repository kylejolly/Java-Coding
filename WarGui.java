package labex2;
import java.awt.*;
import java.awt.event.*;

public class WarGui extends Frame implements ActionListener
{
    public WarGui()
    {
         
        setResizable(false);
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        addWindowListener( new CloseWindow());
        
        setTitle("War");
    }
    public void actionPerformed(ActionEvent e) 
    {
        
    }
     public class CloseWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }// CloseWindow
}
