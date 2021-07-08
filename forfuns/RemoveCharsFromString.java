/* objectif: remove specified chars from a string
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 8.07.2021
 *
 */

import java.util.Scanner;

public class RemoveCharsFromString {

	public static void main(String [] args) {
		
		Scanner lectureClavier = new Scanner(System.in);
		String phrase = "";
		String caracteres = "";
		String phraseModifiee = "";

		System.out.print("Entrez la phrase: ");
		phrase = lectureClavier.nextLine();
		System.out.print("Entrez la chaine de caractères: ");
		caracteres = lectureClavier.next();

		//System.out.println("Phrase : " + phrase);
		//System.out.println("Chars : " + caracteres);

		String ch1, ch2;

		for (int i = 0; i < caracteres.length(); i++) {

			for (int j = 0; j < phrase.length(); j++) {
				if (phrase.charAt(j) == caracteres.charAt(i)) {

					//ch1 = phrase.substring(j);
					//ch2 = phrase.substring(j, phrase.length() - 1);
					//phraseModifiee = ch1.concat(ch2);
					phraseModifiee = phrase.substring(j+1);
				}
			
			}
		}

		System.out.println("Phrase modifiée: " + phraseModifiee);


	}

}
