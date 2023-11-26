package blackjack4;

class Carta {
    private final String rango;
    private final String palo;
    private final int valor;

    public Carta(String rango, String palo, int valor) {
        this.rango = rango;
        this.palo = palo;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String toString() {
        return rango + " de " + palo;
    }
}
