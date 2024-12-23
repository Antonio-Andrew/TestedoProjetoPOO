package view;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class GridBagLayoutDemo extends JFrame {
	
	public GridBagLayoutDemo() {
		GridBagLayout layout = new GridBagLayout();
		this.setSize(450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Alguma coisa");
		this.setLayout(layout);
		
		
		
		this.setVisible(true);
	}
}
