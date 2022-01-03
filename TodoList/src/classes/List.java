package classes;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel {

	List() {

		GridLayout layout = new GridLayout(10, 1);
		layout.setVgap(5);
		this.setLayout(layout);
//		this.setBackground(Color.blue);

	}

//	index function
	public void updateNumbers() {
		Component[] listItems = this.getComponents();

		for (int i = 0; i < listItems.length; i++) {
			if (listItems[i] instanceof TaskList) {
				((TaskList) listItems[i]).changeIndex(i + 1);
			}
			;
		}
	};

	public void removeCompletedTask() {
		for (Component c : getComponents()) {
			if (c instanceof TaskList) {
				if (((TaskList) c).getState()) {
					remove(c);
					updateNumbers();
				}
				;
			}
			;
		}
		;
	};

}
