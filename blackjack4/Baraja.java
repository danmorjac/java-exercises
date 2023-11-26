package blackjack4;

import java.util.ArrayList;
import java.util.List;

public class Baraja {
    private final List<Carta> cartas;

    public Baraja() {
    	cartas = new ArrayList<>();
        String[] suits = {"Corazones", "Diamantes", "Tréboles", "Espadas"};
        String[] ranks = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
            	Carta card = new Carta(ranks[i], suit, values[i]);
                cartas.add(card);
            }
        }
    }

    public void barajar() {
        for (int i = cartas.size() - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }

    public Carta sacarCarta() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(0);
    }
}

