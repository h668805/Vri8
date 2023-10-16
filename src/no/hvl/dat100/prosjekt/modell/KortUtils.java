package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling samling av kort som skal sorteres.
	 */

	public static void sorter(KortSamling samling) {
		for (int antall = samling.getAntalKort(); antall > 0; antall--) {
			Kort minst = samling.getAllekort()[0];
			for (int i = 1; i < antall; i++) {
				if (samling.getAllekort()[i].compareTo(minst) < 0) {
					minst = samling.getAllekort()[i];
				}
			}
			samling.fjern(minst);
			samling.leggTil(minst);

		}

	}

	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {
		Random rand = new Random();
		int random = 0;
		for (int i = 0; i < 50; i++) {

			for (int antall = samling.getAntalKort(); antall > 0; antall--) {
				random = rand.nextInt(antall);
				
				Kort kort = samling.getAllekort()[random];
				
				samling.fjern(kort);
				samling.leggTil(kort);
			}
		}

	}

}
