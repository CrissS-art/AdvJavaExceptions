package advEx3Package;

import java.util.Scanner;
import java.util.ArrayList;

public class Resto {

		static final String[][] menu = {
			    {"Entrée : ", "Salade", "Soupe", "Quiche", "Aucune"},
			    {"Plats : ", "Poulet", "Boeuf", "Poisson", "Végétarien", "Vegan", "Aucun"},
			    {"Accompagnement :", "Riz", "Pâtes", "Frites", "Légumes", "Aucun"},
			    {"Boissons : ", "Eau plate", "Eau gazeuse", "Soda", "Vin", "Aucune"},
			    {"Desserts : ", "Tarte maison", "Mousse au chocolat", "Tiramisu", "Aucune"}
			};
		
		public static int getChoice(String table[], Scanner scan) {

			System.out.println("Que souhaitez-vous comme " + table[0]);
			for(int i=0; i < table.length; i++) {
				System.out.print("[" + i + "-" + table[i] + "]");
			}
			int choice = scan.nextInt();
			return choice;
			}
		
		public static void main(String[] args) {
			
//			créer un tableau
			ArrayList<String> yourOrders = new ArrayList();
					
			// 1 - Afficher un texte " Bonjour, combien de menus souhaitez-vous ? "
			System.out.println("Bonjour, combien de menus souhaitez-vous ?");

//				créer le scanner
			Scanner scan = new Scanner(System.in);

			// 2 - Lecture, vérification et enregistrement de la réponse
			int orderNumber = scan.nextInt();
			
//				3 répéter un ensemble d'action: menu par commande
			for(int i = 1; i < orderNumber + 1; i++) {
				
//	 		3.1 - Afficher le numéro de la commande		
				System.out.println("\n Commande numéro : " + (i));
				
				
//		 	3.2 - Gestion du sous-menu de l'entrée 
				
				// 3.2.1 - Affichage des choix
				for(int printOptions = 1; printOptions < menu[0].length; printOptions++) {
					System.out.println(printOptions + " - " + menu[0][printOptions]);
				}
				
				// 3.2.2 - Selection et stockage du choix	
				int choice = scan.nextInt();
				yourOrders.add(menu[0][choice]);
				System.out.println(yourOrders);
				
				// 3.3 - Gestion du sous-menu des plats 
				
				// 3.3.1 - Affichage des choix
			
			
				// 3.3.2 - Selection et stockage du choix
			
		
			// 3.4 
		
			// 3.5
		
			// 3.6
		
				
			// 3.7 - Afficher le résumé de la commande

				// 4 - Programme fini.
				System.out.println("Merci pour vos commandes, et à bientôt !");
			}

				
			}
		}



	//String[] yourOrders = new String[n];
	//
	//for (int i = 0; i < n; i++) {
//	    System.out.print("Entrez l'élément " + (i + 1) + ": ");
//	    yourOrders[i] = scanner.nextLine();
	//}
	//
	//System.out.println("Vos commandes:");
	//for (String order : yourOrders) {
//	    System.out.println(order);
	//}


	/*algo:
	 * 		1 - Afficher un texte " Bonjour, combien de menus souhaitez-vous ? "
	 * 		2 - Lecture, vérification et enregistrement de la réponse
	 * 		3 - Créer un tableau avec les menus
	 * 		4 - Répéter un ensemble d'action: menu par commande
	 * 			4.1 - Afficher le numéro de la commande		
	 *			4.2 - Gestion du sous-menu de: l'entrée, plat, boissons etc			
	 *				4.2.1 - Afficher les choix
	 *				4.2.2 - Selection et stockage du choix	
	 *					Créer un tableau pour récupérer les choix de l'UI
	 *			4.7 Afficher le résumé de la commande
	 *			4.8 Répéter pour chaque commande
	 *	 	5 Programme fini
	 * */

