/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Classe qui formate les nombres d'une jtable
 * @author sociepka
 */
public class NumberCellRenderer extends DefaultTableCellRenderer {
   DecimalFormat numberFormat = new DecimalFormat("####.##;(#,###.##)");
@Override

public Component getTableCellRendererComponent(JTable jTable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
Component c = super.getTableCellRendererComponent(jTable, value, isSelected, hasFocus, row, column);

    if (c instanceof JLabel && value instanceof Number) {
        JLabel label = (JLabel) c;
        label.setHorizontalAlignment(JLabel.RIGHT);
        Number num = (Number) value;
        String text = numberFormat.format(num);
        label.setText(text);
        
        label.setForeground(num.doubleValue() < 0 ? Color.RED : Color.BLACK);
         }
return c;
}

    
}
