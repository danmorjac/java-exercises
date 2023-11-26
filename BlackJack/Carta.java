package BlackJack;

class Carta {
    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    public int getValorNumerico() {
        if (valor.equals("As")) {
            return 11;
        } else if (valor.equals("Jota") || valor.equals("Reina") || valor.equals("Rey")) {
            return 10;
        } else {
            return Integer.parseInt(valor);
        }
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
