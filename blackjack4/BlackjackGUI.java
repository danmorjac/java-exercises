package blackjack4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlackjackGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jugador1Label;
	private JLabel jugador2Label;
	private JButton pedirCartaButton1;
	private JButton plantarseButton1;
	private JButton pedirCartaButton2;
	private JButton plantarseButton2;
	private JTextArea manoJugador1Area;
	private JTextArea manoJugador2Area;

	private Baraja baraja;
	private Mano manoJugador1;
	private Mano manoJugador2;

	public BlackjackGUI() {
		baraja = new Baraja();
		baraja.barajar();

		manoJugador1 = new Mano();
		manoJugador2 = new Mano();

		jugador1Label = new JLabel("Jugador 1");
		jugador1Label.setHorizontalAlignment(SwingConstants.CENTER);
		jugador1Label.setBounds(104, 12, 106, 48);

		manoJugador1Area = new JTextArea();
		manoJugador1Area.setVisible(true);
		manoJugador1Area.setBounds(114, 72, 124, 254);

		pedirCartaButton1 = new JButton("Pedir carta");
		pedirCartaButton1.setBounds(28, 385, 124, 81);

		plantarseButton1 = new JButton("Plantarse");
		plantarseButton1.setBounds(192, 385, 124, 81);

		jugador2Label = new JLabel("Jugador 2");
		jugador2Label.setHorizontalAlignment(SwingConstants.CENTER);
		jugador2Label.setBounds(536, 12, 111, 48);

		manoJugador2Area = new JTextArea();
		manoJugador2Area.setVisible(false);
		manoJugador2Area.setBounds(541, 84, 124, 254);

		pedirCartaButton2 = new JButton("Pedir carta");
		pedirCartaButton2.setEnabled(false);
		pedirCartaButton2.setBounds(469, 385, 124, 81);

		plantarseButton2 = new JButton("Plantarse");
		plantarseButton2.setEnabled(false);
		plantarseButton2.setBounds(627, 385, 124, 81);

		configurarInterfaz();
		repartirCartasIniciales();

		pedirCartaButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				manoJugador1.agregarCarta(baraja.sacarCarta());
				actualizarAreaManoJugador1();
				if (manoJugador1.getValor() > 21) {
					mostrarResultado("Jugador 1 se pasa de 21. Jugador 2 gana.");
				}
			}
		});

		plantarseButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				turnoJugador1Terminado();
			}
		});

		pedirCartaButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				manoJugador2.agregarCarta(baraja.sacarCarta());
				actualizarAreaManoJugador2();
				if (manoJugador2.getValor() > 21) {
					mostrarResultado("Jugador 2 se pasa de 21. Jugador 1 gana.");
				}
			}
		});

		plantarseButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				turnoJugador2Terminado();
			}
		});
	}

	private void configurarInterfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Blackjack");

		manoJugador1Area.setEditable(false);
		manoJugador2Area.setEditable(false);
		getContentPane().setLayout(null);

		getContentPane().add(jugador1Label);
		getContentPane().add(jugador2Label);

		getContentPane().add(manoJugador1Area);
		getContentPane().add(manoJugador2Area);

		getContentPane().add(pedirCartaButton1);
		getContentPane().add(pedirCartaButton2);

		getContentPane().add(plantarseButton1);
		getContentPane().add(plantarseButton2);

		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				reiniciarJuego();
			}
		});
		btnReiniciar.setBounds(678, 12, 105, 27);
		getContentPane().add(btnReiniciar);

		setSize(803, 552);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void reiniciarJuego() {

		baraja = new Baraja();
		baraja.barajar();

		manoJugador1 = new Mano();
		manoJugador2 = new Mano();

		manoJugador1Area.setVisible(true);
		manoJugador2Area.setVisible(false);
		pedirCartaButton1.setEnabled(true);
		plantarseButton1.setEnabled(true);
		pedirCartaButton2.setEnabled(false);
		plantarseButton2.setEnabled(false);

		manoJugador1Area.setText("");
		manoJugador2Area.setText("");

		repartirCartasIniciales();

	}


	private void repartirCartasIniciales() {
		manoJugador1.agregarCarta(baraja.sacarCarta());
		manoJugador2.agregarCarta(baraja.sacarCarta());
		manoJugador1.agregarCarta(baraja.sacarCarta());
		manoJugador2.agregarCarta(baraja.sacarCarta());

		actualizarAreaManoJugador1();
		actualizarAreaManoJugador2();
	}

	private void actualizarAreaManoJugador1() {
		manoJugador1Area.setText(manoJugador1.toString());
	}

	private void actualizarAreaManoJugador2() {
		manoJugador2Area.setText(manoJugador2.toString());
	}

	private void turnoJugador1Terminado() {
		pedirCartaButton1.setEnabled(false);
		plantarseButton1.setEnabled(false);

		turnoJugador2();
	}

	private void turnoJugador2Terminado() {
		pedirCartaButton2.setEnabled(false);
		plantarseButton2.setEnabled(false);
		manoJugador1Area.setVisible(true);

		int valorJugador1 = manoJugador1.getValor();
		int valorJugador2 = manoJugador2.getValor();

		actualizarAreaManoJugador2();

		if (valorJugador1 > valorJugador2) {
			mostrarResultado("Jugador 1 gana.");
		} else if (valorJugador2 > valorJugador1) {
			mostrarResultado("Jugador 2 gana.");
		} else {
			mostrarResultado("Empate.");
		}
	}

	private void turnoJugador2() {
		manoJugador2Area.setVisible(true);
		manoJugador1Area.setVisible(false);
		pedirCartaButton2.setEnabled(true);
		plantarseButton2.setEnabled(true);
	}

	private void mostrarResultado(String resultado) {
		JOptionPane.showMessageDialog(this, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new BlackjackGUI();
			}
		});
	}
}