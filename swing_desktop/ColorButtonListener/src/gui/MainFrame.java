package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		
		final MainPanel mainPanel = new MainPanel();
		final Toolbar toolBar = new Toolbar(mainPanel);
		setLayout(new BorderLayout());
		add(toolBar, BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);

		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}