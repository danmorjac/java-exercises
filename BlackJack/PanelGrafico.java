package BlackJack;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class PanelGrafico extends JPanel implements ActionListener {
	private JLabel tituloLabel;
	private JLabel crupierLabel;
	private JLabel jugador1Label;
	private JLabel resultadoLabel;
	private JButton otraCartaButton;
	private JButton plantarseButton;
	private JButton iniciarbutton;
	private JButton reiniciarbutton;
	private JuegoBlackjack juego;

	public PanelGrafico() {
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		tituloLabel = new JLabel("Blackjack", SwingConstants.CENTER);
		tituloLabel.setBounds(235, 8, 430, 33);
		tituloLabel.setFont(new Font("Arial", Font.BOLD, 24));

		crupierLabel = new JLabel("", SwingConstants.CENTER);
		crupierLabel.setBounds(242, 24, 430, 66);
		crupierLabel.setFont(new Font("Arial", Font.PLAIN, 18));

		jugador1Label = new JLabel("", SwingConstants.CENTER);
		jugador1Label.setBounds(255, 244, 430, 66);
		jugador1Label.setFont(new Font("Arial", Font.PLAIN, 18));


		resultadoLabel = new JLabel("", SwingConstants.CENTER);
		resultadoLabel.setBounds(76, 120, 759, 66);
		resultadoLabel.setFont(new Font("Arial", Font.BOLD, 20));

		JPanel centerPanel = new JPanel();
		centerPanel.setBounds(0, 53, 910, 349);
		centerPanel.setLayout(null);
		centerPanel.add(crupierLabel);
		centerPanel.add(jugador1Label);
		centerPanel.add(resultadoLabel);
		setLayout(null);

		add(tituloLabel);
		add(centerPanel);

		plantarseButton = new JButton("Plantarse");
		plantarseButton.setBounds(628, 414, 241, 27);
		add(plantarseButton);
		plantarseButton.addActionListener(this);

		otraCartaButton = new JButton("Otra carta");
		otraCartaButton.setBounds(12, 414, 241, 27);
		add(otraCartaButton);
		otraCartaButton.addActionListener(this);

		iniciarbutton = new JButton("Iniciar");
		iniciarbutton.setBounds(12, 14, 105, 27);
		add(iniciarbutton);
		iniciarbutton.addActionListener(this);

		reiniciarbutton = new JButton("Reiniciar");
		reiniciarbutton.setBounds(764, 16, 105, 27);
		add(reiniciarbutton);
		reiniciarbutton.addActionListener(this) ;

		reiniciarJuego();
	}


	private void reiniciarJuego() {
		juego = new JuegoBlackjack();
		juego.jugar();

		crupierLabel.setText("Crupier: ???");
		jugador1Label.setText("Jugador1: 0");
		resultadoLabel.setText("");

		otraCartaButton.setEnabled(true);
		plantarseButton.setEnabled(true);
	}

	private void actualizarVista() {
		crupierLabel.setText("Crupier: " + juego.getPuntosCrupier());
		jugador1Label.setText("Jugador: " + juego.getPuntosJugador());

		if (juego.isTerminado()) {
			otraCartaButton.setEnabled(false);
			plantarseButton.setEnabled(false);

			String resultado = juego.getResultado();
			resultadoLabel.setText(resultado);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== iniciarbutton) {actualizarVista();}
		if (e.getSource()== reiniciarbutton) {reiniciarJuego();}
		if (e.getSource() == otraCartaButton) {
			juego.jugadorTomaCarta();
			actualizarVista();
		} else if (e.getSource() == plantarseButton) {
			juego.crupierJuega();
			actualizarVista();
		}
	}
}
