package main;

import main.Principale;

public class Trieur extends Thread {
	int debut;
	int fin;

	Trieur(int debut, int fin) {
		this.debut = debut;
		this.fin = fin;
	}

	public void run() {
		int aux = 0;
		for (int i = debut; i < fin - 1; i++) {
			for (int j = i + 1; j < fin; j++) {
				if (Principale.tab[i] > Principale.tab[j]) {
					aux = Principale.tab[i];
					Principale.tab[i] = Principale.tab[j];
					Principale.tab[j] = aux;
				}
			}
		}

	}
}
