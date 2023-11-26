package blackjack4;

import java.util.ArrayList;
import java.util.List;

public class Mano {
    private final List<Carta> cartas;

    public Mano() {
    	cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
    	cartas.add(carta);
    }

    public int getValor() {
        int value = 0;
        int numAces = 0;

        for (Carta carta : cartas) {
            value += carta.getValor();
            if (carta.getValor() == 1) {
                numAces++;
            }
        }

        while (value <= 11 && numAces > 0) {
            value += 10;
            numAces--;
        }

        return value;
    }

    public String toString() {
        StringBuilder handString = new StringBuilder();
        for (Carta carta : cartas) {
            handString.append(carta.toString()).append("\n");
        }
        handString.append("Valor total: ").append(getValor());
        return handString.toString();
    }
}