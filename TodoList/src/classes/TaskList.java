package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TaskList extends JPanel {

//	styles
	private JLabel index;
	private JTextField taskName;
	private JButton completed;

	private boolean checked;

//	Constructor
	TaskList() {

//		index

		this.setPreferredSize(new Dimension(40, 20));
		this.setBackground(Color.red);

		this.setLayout(new BorderLayout());

		checked = false;

		index = new JLabel("");
		index.setPreferredSize(new Dimension(20, 20));
		index.setHorizontalAlignment(JLabel.CENTER);

//		taskName
		taskName = new JTextField("Enter Task");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.red);

//		completed

		completed = new JButton("completed");
		completed.setPreferredSize(new Dimension(80, 20));
		completed.setBorder(BorderFactory.createEmptyBorder());

		this.add(index, BorderLayout.WEST);
		this.add(taskName, BorderLayout.CENTER);
		this.add(completed, BorderLayout.EAST);

	}

//	functions
//	index key creator
	public void changeIndex(int num) {
		this.index.setText(num + "");
		this.revalidate();

	};

//	changes task color and boolean

	public boolean getState() {
		return checked;
	};

	public void changeState() {
		this.setBackground(Color.green);
		taskName.setBackground(Color.green);
		checked = true;

	};

//	completed button function
	public JButton getCompleted() {
		return completed;
	};

}
