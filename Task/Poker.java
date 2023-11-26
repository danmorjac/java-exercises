package Task;

import java.util.ArrayList;
import java.util.Scanner;


public class Poker {

	public static String juego(String[] manoWhite, String[] manoBlack) {
		if (valorMano(manoBlack) > valorMano(manoWhite)) {
			return "Black wins.";
		}
		if (valorMano(manoBlack) < valorMano(manoWhite)) {
			return "White wins.";
		}
		if (valorMano(manoBlack) == valorMano(manoWhite)) {
			return "Tie.";
		}
		return "";
	}

	public static int valorMano(String[] mano) {
		int valorMano = 0;
		if (pares(mano) == 1) {
			valorMano = 1;
		}
		if (pares(mano) == 2) {
			valorMano = 2;
		}
		if (trios(mano) == 1) {
			valorMano = 3;
		}
		if (escalera(mano) == 1) {
			valorMano = 4;
		}
		if (color(mano) == 1) {
			valorMano = 5;
		}
		if (pares(mano) == 1 && trios(mano) == 1) {
			valorMano = 6;
		}
		if (poker(mano) == 1) {
			valorMano = 7;
		}
		if (color(mano) == 1 && escalera(mano) == 1) {
			valorMano = 8;
		}
		return valorMano;
	}
	public static int pares(String[] mano) {
		int nPares = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (mano[i].contains("" + mano[j].charAt(0))) {
					nPares++;
				}
			}
		}
		return nPares;
	}

	public static int trios(String[] mano) {
		int nTrios = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				for (int k = j + 1; k < 5; k++) {
					if (mano[i].charAt(0) == mano[j].charAt(0) && mano[j].charAt(0) == mano[k].charAt(0)) {
						nTrios++;
					}
				}
			}
		}
		return nTrios;
	}

	public static int poker(String[] mano) {
		for (int i = 0; i < 2; i++) {
			if (mano[i].charAt(0) == mano[i + 1].charAt(0) && mano[i + 2].charAt(0) == mano[i + 3].charAt(0) && mano[i].charAt(0) == mano[i + 3].charAt(0)) {
				return 1;
			}
		}
		return 0;
	}

	public static int color(String[] mano) {

		if (mano[0].charAt(1) == mano[1].charAt(1) && mano[2].charAt(1) == mano[3].charAt(1) && mano[1].charAt(1) == mano[4].charAt(1) && mano[0].charAt(1) == mano[2].charAt(1)) {
			return 1;
		}
		return 0;
	}

	public static int escalera(String[] mano) {
		int[] escalera = new int[14];
		int contador = 0;
		for (int i = 0; i < escalera.length; i++) {
			escalera[i] = 0;
		}
		for (int i = 0; i < mano.length; i++) {
			if (mano[i].charAt(0) == 'A') {
				escalera[13] = 1;
				escalera[0] = 1;
			}
			if (mano[i].charAt(0) == 'T') {
				escalera[9] = 1;
			}
			if (mano[i].charAt(0) == 'J') {
				escalera[10] = 1;
			}
			if (mano[i].charAt(0) == 'Q') {
				escalera[11] = 1;
			}
			if (mano[i].charAt(0) == 'K') {
				escalera[12] = 1;
			}
			if (mano[i].charAt(0) == '2') {
				escalera[1] = 1;
			}
			if (mano[i].charAt(0) == '3') {
				escalera[2] = 1;
			}
			if (mano[i].charAt(0) == '4') {
				escalera[3] = 1;
			}
			if (mano[i].charAt(0) == '5') {
				escalera[4] = 1;
			}
			if (mano[i].charAt(0) == '6') {
				escalera[5] = 1;
			}
			if (mano[i].charAt(0) == '7') {
				escalera[6] = 1;
			}
			if (mano[i].charAt(0) == '8') {
				escalera[7] = 1;
			}
			if (mano[i].charAt(0) == '9') {
				escalera[8] = 1;
			}

		}
		for (int i = 0; i < escalera.length - 5; i++) {
			int j = i;
			while (escalera[j + 1] == 1) {
				contador++;
				j++;
			}
			j = 0;
			if (contador == 4) {
				return 1;
			}
			contador = 0;
		}
		return 0;
	}

	public static void main(String[] args) {
		String[] parteTxt = new String[10];
		ArrayList<String> resultados = new ArrayList<>();
		ArrayList<String> cadenas = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		String[] white = new String[5];
		String[] black = new String[5];
		do{
			cadenas.add(s.nextLine());
		}while(!cadenas.get(cadenas.size()-1).isEmpty());
		for (int i = 0; i < cadenas.size()-1; i++) {    
			parteTxt = cadenas.get(i).split(" ");
			for (int j = 0; j < 10; j++) {
				if (j < 5) {
					white[j] = parteTxt[j];
				}
				if (j >= 5) {
					black[j - 5] = parteTxt[j];
				}
			}
			resultados.add(juego(white, black));
		}
		for (int i = 0; i < resultados.size(); i++) {
			System.out.println(resultados.get(i));
		}
	}
}   

