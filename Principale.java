package main;

import java.util.Scanner;

public class Principale {
	static int n = 6;
	// declaration du tableau
	static int[] tab = new int[n];

	void saisie() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			tab[i] = sc.nextInt();
		}
	}

	void fusion() {
		int i = 0, j = n / 2, k = 0, milieu = n / 2;
		int[] w = new int[n];
		while (i < milieu && j < n) {
			if (tab[i] < tab[j]) {
				w[k] = tab[i];
				k++;
				i++;
				if (i == milieu - 1) {
					for (int p = j; p < n; p++) {
						w[k] = tab[p];
						k++;
					}
				}
			} else {
				w[k] = tab[j];
				k++;
				j++;
				if (j == n) {
					for (int p = i; p < milieu; p++) {
						w[k] = tab[p];
						k++;
					}
				}
			}
		}
		tab = w;
	}

	void affichage() {
		for (int i = 0; i < n; i++) {
			System.out.println(tab[i]);
		}
	}

	public static void main(String args[]) {
		Principale P = new Principale();
		P.saisie();
		Trieur t1 = new Trieur(0, n / 2);
		Trieur t2 = new Trieur(n / 2, n);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			P.fusion();
			P.affichage();
		} catch (InterruptedException e) {

		}
	}
}
