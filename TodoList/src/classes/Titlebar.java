package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Titlebar extends JPanel {
	
//	Constructor
	Titlebar(){
		
		this.setPreferredSize(new Dimension(1079, 100));
//		this.setBackground(Color.red);
		
		JLabel titleText = new JLabel("To Do List: ");
		titleText.setPreferredSize(new Dimension(480,100));
		titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
		
		
	}
	
	

}
