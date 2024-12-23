package pacoteprincipal;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo extends JFrame {
	
	public GridBagLayoutDemo() {
		
		GridBagConstraints gbc = new GridBagConstraints();
		GridBagLayout layout = new GridBagLayout();
		
		this.setSize(450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Alguma coisa");
		this.setLocationRelativeTo(null);
		this.setLayout(layout);
		
		JButton botao1 = new JButton("Botão 1");
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(botao1, gbc);

		
		JButton botao2 = new JButton("Botão 2");
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(botao2, gbc);

		
		JButton botao3 = new JButton("Botão 3");
		gbc.gridx = 2;
		gbc.gridy = 2;
		this.add(botao3, gbc);

		
		JButton botao4 = new JButton("Botão 4");
		gbc.gridx = 3;
		gbc.gridy = 3;
		this.add(botao4, gbc);

		
		JButton botao5 = new JButton("Botão 5");
		gbc.gridx = 4;
		gbc.gridy = 4;
		this.add(botao5, gbc);

		
		
		this.setVisible(true);
	}
}
