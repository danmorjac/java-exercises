package BlackJack;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Jugar {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Blackjack");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(900, 500));

		PanelGrafico panel = new PanelGrafico();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}