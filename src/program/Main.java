package program;

/*
beecrowd | 1098 - Sequencia IJ 4

Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.
*/

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.0");

		for (double i = 0.0, j = 1, j2 = 0.2; i <= 2; j = 1 + j2, j2 += 0.2,i += 0.2) {
			for (int p = 0; p < 3; p++, j++) {
				if (df.format(i).endsWith("0")) {
					System.out.printf("I=%.0f J=%.0f\n", i, j);
				} else {
					System.out.printf("I=%.1f J=%.1f\n", i, j);
				}
			}
		}
	}
}
