import java.util.Scanner;

public class Sdz {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Veuillez saisir un mot :"); String str = sc.nextLine();
		 * System.out.println("Vous avez saisi : " + str);
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Veuillez saisir un nombre :"); int str = sc.nextInt();
		 * System.out.println("Vous avez saisi le nombre : " + str);
		 */

		/*
		 * System.out.println("Saisissez une lettre :"); Scanner sc = new
		 * Scanner(System.in); String str = sc.nextLine(); char carac = str.charAt(0);
		 * System.out.println("Vous avez saisi le caractère : " + carac);
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Saisissez un entier : "); int i = sc.nextInt();
		 * System.out.println("Saisissez une chaîne : "); String str = sc.nextLine();
		 * System.out.println("FIN ! ");
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Saisissez un entier : "); int i = sc.nextInt();
		 * System.out.println("Saisissez une chaîne : "); // On vide la ligne avant d'en
		 * lire une autre sc.nextLine(); String str = sc.nextLine();
		 * System.out.println("FIN ! ");
		 */

		/*
		 * int note = 10; // On imagine que la note maximale est 20
		 * 
		 * switch (note) { case 0: System.out.println("Ouch !"); break; case 10:
		 * System.out.println("Vous avez juste la moyenne."); break; case 20:
		 * System.out.println("Parfait !"); break; default:
		 * System.out.println("Il faut davantage travailler."); }
		 */

		/*
		 * String prenom; char reponse = 'O'; Scanner sc = new Scanner(System.in); while
		 * (reponse == 'O') { System.out.println("Donnez un prénom : "); prenom =
		 * sc.nextLine(); System.out.println("Bonjour " + prenom +
		 * ", comment vas-tu ?"); // Sans ça, nous n'entrerions pas dans la deuxième
		 * boucle reponse = ' ';
		 * 
		 * // Tant que la réponse n'est pas O ou N, on repose la question while (reponse
		 * != 'O' && reponse != 'N') { // On demande si la personne veut faire un autre
		 * essai System.out.println("Voulez-vous réessayer ? (O/N)"); reponse =
		 * sc.nextLine().charAt(0); } } System.out.println("Au revoir…");
		 */

		/*
		 * int a = 1, b = 15; while (a < b) { System.out.println("coucou " +a+
		 * " fois !!"); }
		 */

		/*
		 * int a = 1, b = 15; while (a < b) { System.out.println("coucou " +a+
		 * " fois !!"); }
		 */
		
		/*String prenom = new String();
		//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
		char reponse = ' ';
		 
		Scanner sc = new Scanner(System.in);
		 
		do{
		  System.out.println("Donnez un prénom : ");
		  prenom = sc.nextLine();
		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
		       
		  do{
		    System.out.println("Voulez-vous réessayer ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'O' && reponse != 'N');
		        
		}while (reponse == 'O');
		 
		System.out.println("Au revoir…");*/
		
		for(int i = 0, j = 2; (i < 10 && j <= 6); i++, j+=2){
			  System.out.println("i = " + i + ", j = " + j);
			}
	}
}
