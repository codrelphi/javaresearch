/* objectif: quelques opérations sur ArrayList
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 27.06.2021
 *
 */


import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class TesterArrayList {


	public static void main(String [] args) {

		/* ArrayList: optimisé pour la lecture.
		 * quelques méthodes
		 * add()
		 * addAll()
		 * remove()
		 * removeAll()
		 * size()
		 * contains()
		 * clear()
		 */
		
		int indice;
		String animalAVerifier;
		Scanner lectureClavier;
		ArrayList<String> animaux = new ArrayList<String>(5);
		animaux.add("lion");
		animaux.add("chat");
		animaux.add("perroquet");
		animaux.add("chien");
		animaux.add("léopard");
		/* rien ne nous empêche d'ajouter un autre élément à la lsite vue qu'elle 
		 * est dynamique
		 */
		animaux.add("renard");
		System.out.println("Animaux : " + animaux);
		
		String [] autresAnimauxTab = new String[3];
		autresAnimauxTab[0] = "souris";
		autresAnimauxTab[1] = "criquet";
		autresAnimauxTab[2] = "papillon";
		
		ArrayList<String> autresAnimaux = new ArrayList<String>(autresAnimauxTab.length);
		for (var animal : autresAnimauxTab) {
			autresAnimaux.add(animal);
		}
		animaux.addAll(0, autresAnimaux);

		System.out.println("Animaux : " + animaux);

		lectureClavier = new Scanner(System.in);
		do {
			System.out.print("Quel indice voulez-vous ? : ");
			indice = lectureClavier.nextInt();
		} while(indice < 0 || indice > (animaux.size() - 1));
		System.out.println(" Vous avez choisi l'animal : " + animaux.get(indice));
		animaux.remove(indice);
		System.out.println("Animaux : " + animaux);
		
		System.out.print("Est-ce que la liste contient : ");
		animalAVerifier = lectureClavier.next();
		
		System.out.println("La liste " + animaux);
		if (animaux.contains(animalAVerifier))
			System.out.println(" contient : " + animalAVerifier);
		else 
			System.out.println(" ne contient pas : " + animalAVerifier);
		
		animaux.clear();
		System.out.print("Animaux : " + animaux);
		if (animaux.size() == 0) System.out.print(" : la liste a été vidée ! Au revoir !");
		else System.out.print(" : la liste est toujours là !");
		System.out.println();
	}
}

