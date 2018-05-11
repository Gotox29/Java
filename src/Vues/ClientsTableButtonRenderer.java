package Vues;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

class ClientsTableButtonRenderer extends JButton implements TableCellRenderer
{
	public ClientsTableButtonRenderer()
	{
		setOpaque(true);
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	{
		setForeground(Color.black);
		setBackground(UIManager.getColor("Button.background"));
		setText((value == null) ? "" : value.toString());
		return this;
	}
}