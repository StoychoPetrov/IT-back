import com.sun.javaws.jnl.XMLFormat;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by stoycho.petrov on 12/04/2017.
 */
public class First extends Applet{

    private TextField   text1;
    private JFrame      table;

    public void init() {
        text1 = new TextField(8);
        table = new JFrame();

        add(text1);
        text1.setText("0");
    }

    public void paint(Graphics g) {
        int x=0,y=0,z=0;
        String s1,s2,s;
        try
        {
            s1 = text1.getText();
            x = Integer.parseInt(s1);
        }
        catch(Exception e) {}
    }

    public boolean action(Event event, Object obj)
    {
        int number = Integer.parseInt(text1.getText());
        Table table = new Table(number);
        table.show();

        return true;
    }
}
