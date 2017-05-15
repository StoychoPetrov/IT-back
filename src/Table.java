import com.sun.javaws.jnl.XMLFormat;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.xml.XMLConstants;
import java.awt.*;

/**
 * Created by stoycho.petrov on 12/04/2017.
 */
public class Table extends JFrame {

    public Table(int number){


        long result = 1;

        Object[][] data = new Object[number][3];
        for(int i = 1; i <= number; i++){
            long newResult = i * result;
            data[i- 1][0] = result + " * " + i;
            data[i - 1][1] = "=";
            data[i - 1][2] = newResult;
            result = newResult;
        }
        DefaultTableModel model = new DefaultTableModel(data,new String[]{"aaa","=","result"});
        JTable table = new JTable(model);
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.blue);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(50);
        columnModel.getColumn(2).setPreferredWidth(150);

        add(new JScrollPane(table));
        setVisible(true);
        add(table);
        Button button = new Button("Svae");
        button.setSize(150,150);
        add(button);
    }
}
