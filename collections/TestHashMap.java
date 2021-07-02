/* objectif: juste tester HashMap
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 02.07.2021
 *
 */

import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;


public class TestHashMap {

	public static void main(String [] args) {

		HashMap<Integer, String> nombres = new HashMap<Integer, String>();
		
		System.out.println("Nombres : " + nombres);
		System.out.println(" Taille : " + nombres.size());
		System.out.println(" Vide ou pas ? : " + nombres.isEmpty());

		nombres.put(1, "un");
		nombres.put(2, "deux");
		nombres.put(3, "trois");
		nombres.put(4, "quatre");
		nombres.put(5, "cinq");

		System.out.println("Nombres : " + nombres);
		System.out.println(" Taille : " + nombres.size());
		System.out.println(" Vide ou pas ? : " + nombres.isEmpty());

		Collection<String> c = nombres.values();
		System.out.println("Parcours en utilisant un Iterator");
		for (Iterator i = c.iterator(); i.hasNext();)
			System.out.println(i.next());

		System.out.println("Parcourir le HashMap sans Iterator");
		for (var n : c)
			System.out.println(n);

	}

}
