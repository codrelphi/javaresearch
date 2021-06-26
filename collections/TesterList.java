/* objectif: tester les lists (ArrayList)
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 26.06.2021
 *
 */

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TesterList {


	public static void main(String [] args) {

		Scanner lectureClavier = new Scanner(System.in);

		List<Integer> nombres = new ArrayList<Integer>();
		nombres.add(0);
		nombres.add(5);
		nombres.add(7);
		nombres.add(2);
		nombres.add(1);
		nombres.add(12);
		System.out.println(nombres);
		if (nombres.isEmpty()) {
			System.out.println(" La liste est vide !");
		}
		else {
			System.out.println(" La liste n'est pas vide !");
			System.out.println(" Taille de la liste : " + nombres.size());
			for (var i = 0; i < nombres.size(); i++) {
				System.out.println("  Elément n°" + i + " : " + nombres.get(i));
			}
			System.out.print(" La valeur à chercher : ");
			var aChercher = lectureClavier.nextInt();
			if (nombres.contains(aChercher)) {
				System.out.println(" " + aChercher + " se trouve dans la liste !");
				System.out.println(" à la position " + nombres.indexOf(aChercher));
			}
			else {
				System.out.print(" " + aChercher + " ne se trouve pas dans la liste !");
				System.out.println();
			}
		}

		Collections.sort(nombres);
		System.out.println("Liste triée : " + nombres); 
		


	}

}
