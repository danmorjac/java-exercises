package BlackJack;

import java.util.ArrayList;
import java.util.Random;

class Mazo {
    private ArrayList<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey"};

        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new Carta(palo, valor));
            }
        }
    }

    public void barajar() {
        Random r = new Random();
        for (int i = 0; i < cartas.size(); i++) {
            int j = r.nextInt(cartas.size());
            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }

    public Carta sacarCarta() {
        return cartas.remove(0);
    }
}
