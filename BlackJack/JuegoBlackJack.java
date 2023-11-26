	package BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

class JuegoBlackjack {
	private Mazo mazo;
	private ArrayList<Carta> manoCrupier;
	private ArrayList<Carta> manoJugador;
	private boolean terminado;

	public JuegoBlackjack() {
		mazo = new Mazo();
		manoCrupier = new ArrayList<>();
		manoJugador = new ArrayList<>();
		terminado = false;
	}

	public void jugar() {
		manoCrupier.clear();
		manoJugador.clear();
		mazo.barajar();
		terminado = false;

		// Repartir cartas jugadores y crupier
		manoCrupier.add(mazo.sacarCarta());
		manoJugador.add(mazo.sacarCarta());
		manoCrupier.add(mazo.sacarCarta());
		manoJugador.add(mazo.sacarCarta());

	}

	public void jugadorTomaCarta() {
		if (!terminado) {
			manoJugador.add(mazo.sacarCarta());
			if (getPuntosJugador() > 21) {
				terminado = true;
			}
		}
	}

	public void crupierJuega() {
		if (!terminado) {
			while (getPuntosCrupier() < 17) {
				manoCrupier.add(mazo.sacarCarta());
			}
			terminado = true;
		}
	}

	public int getPuntosJugador() {
		int puntos = 0;
		int numAces = 0;

		for (Carta carta : manoJugador) {
			puntos += carta.getValorNumerico();
			if (carta.getValor().equals("As")) {
				numAces++;
			}

			// Convertir ases de 11 a 1 si se pasan de 21
			while (puntos > 21 && numAces > 0) {
				puntos -= 10;
				numAces--;
			}
		}

		return puntos;
	}

	public int getPuntosCrupier() {
		int puntos = 0;
		int numAces = 0;

		for (Carta carta : manoCrupier) {
			puntos += carta.getValorNumerico();
			if (carta.getValor().equals("As")) {
				numAces++;
			}

			// Convertir ases de 11 a 1 si se pasan de 21
			while (puntos > 21 && numAces > 0) {
				puntos -= 10;
				numAces--;
			}
		}

		return puntos;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public String getResultado() {
		int puntosJugador = getPuntosJugador();
		int puntosCrupier = getPuntosCrupier();

		if (puntosJugador > 21) {
			return "¡Has perdido! Tu puntuación es mayor a 21.";
		} else if (puntosCrupier > 21) {
			return "¡Has ganado! El crupier tiene una puntuación mayor a 21.";
		} else if (puntosJugador > puntosCrupier) {
			return "¡Has ganado! Tu puntuación es mayor a la del crupier.";
		} else if (puntosJugador < puntosCrupier) {
			return "¡Has perdido! La puntuación del crupier es mayor a la tuya";
		}else if (puntosJugador == puntosCrupier) {
			return "¡Empate! La puntuación del crupier y la tuya son la misma";
		}
		return null;
	}

	public String getEstadoJuego() {
		StringBuilder estado = new StringBuilder();

		estado.append("Mano del Crupier: ");
		for (Carta carta : manoCrupier) {
			estado.append(carta.getValor()).append(" ");
		}

		estado.append("\n");

		estado.append("Mano del Jugador: ");
		for (Carta carta : manoJugador) {
			estado.append(carta.getValor()).append(" ");
		}

		estado.append("\n");

		return estado.toString();
	}
}







