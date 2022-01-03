package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonBar extends JPanel {
	
//	styles
	
	private JButton addTask;
	private JButton clearTask;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
//	constructor
	
	ButtonBar()
	{
		this.setPreferredSize(new Dimension(1080,80));

//		this.setBackground(Color.red);
		
		
		addTask = new JButton("Add Task");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("San-serif",Font.PLAIN,40));

		clearTask = new JButton("Clear Completed Task");
		clearTask.setBorder(emptyBorder);
		clearTask.setFont(new Font("San-serif",Font.PLAIN,40));

		
		this.add(addTask);
		this.add(Box.createHorizontalStrut(100));
		this.add(clearTask);
		
	}
	
	public JButton addTask() {
		
		return addTask;
	};
	
public JButton getClear() {
	
	return clearTask;
}

}
