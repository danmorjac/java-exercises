package BlackJack;

import java.util.ArrayList;
import java.util.List;

class Jugador {
	private String nombre;
	private ArrayList<Carta> mano;

	public Jugador(String nombre) {
		this.nombre = nombre;
		mano = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void recibirCarta(Carta carta) {
		mano.add(carta);
	}

	public int getPuntos() {
		int puntos = 0;
		int numAses = 0;

		for (Carta carta : mano) {
			puntos += carta.getValorNumerico();
			if (carta.getValor().equals("As")) {
				numAses++;
			}
		}

		while (puntos > 21 && numAses > 0) {
			puntos -= 10;
			numAses--;
		}

		return puntos;
	}

	public void mostrarMano() {
		System.out.println(nombre + " tiene las siguientes cartas:");
		for (Carta carta : mano) {
			System.out.println("- " + carta);
		}
		System.out.println("Puntos totales: " + getPuntos());
	}
}
