package classes;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame {
//	styles
	private Titlebar title;
	private List list;
	private ButtonBar btnBar;

//	function
	private JButton addTask;
	private JButton clearTask;

//	constructor
	AppFrame() {
		this.setVisible(true);
		this.setSize(1080, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		title = new Titlebar();
		list = new List();
		btnBar = new ButtonBar();

		this.add(title, BorderLayout.NORTH);
		this.add(btnBar, BorderLayout.SOUTH);
		this.add(list, BorderLayout.CENTER);

//		function

		addTask = btnBar.addTask();
		clearTask = btnBar.getClear();

		addListeners();

	}

	public void addListeners() {
		addTask.addMouseListener(new MouseAdapter() {
			@Override
//			add task
			public void mousePressed(MouseEvent e) {
				TaskList task = new TaskList();
				list.add(task);
				list.updateNumbers();

				task.getCompleted().addMouseListener(new MouseAdapter() {
					@Override

//					index/color change for completed button
					public void mousePressed(MouseEvent e) {
						task.changeState();
						list.updateNumbers();
						revalidate();
					};
				});
			}
		});

		clearTask.addMouseListener(new MouseAdapter() {
			@Override
//			clear task
			public void mousePressed(MouseEvent e) {
				list.removeCompletedTask();
				repaint();
			};
		});
	};

}
