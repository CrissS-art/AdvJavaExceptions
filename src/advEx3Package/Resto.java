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

    public static int getChoice(String[] table, Scanner scan) {
        System.out.println("Que souhaitez-vous comme " + table[0]);
        for (int i = 1; i < table.length; i++) {
            System.out.print("[" + i + "-" + table[i] + "] ");
        }
        int choice = scan.nextInt();
        
        if (choice <= 0 || choice >= table.length) {
            System.out.println("Choix invalide, veuillez réessayer.");
            return getChoice(table, scan); 
        }
        return choice;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> recaps = new ArrayList<>();


        System.out.println("Bonjour, combien de menus souhaitez-vous ?");
        int orderNumber = scan.nextInt();

       
        for (int i = 1; i <= orderNumber; i++) {
            ArrayList<String> yourOrders = new ArrayList<>(); 
            System.out.println("\nCommande numéro : " + i);

            // Itérer à travers chaque sous-menu
            for (int j = 0; j < menu.length; j++) {
                int choice = getChoice(menu[j], scan);
                if (choice > 0 && choice < menu[j].length) {
                    String selectedItem = menu[j][choice];
                    if (!selectedItem.equals("Aucune") && !selectedItem.equals("Aucun")) {
                        yourOrders.add(selectedItem);
                    }
                }
            }

            String recap = "Commande " + i + ": " + yourOrders.toString();
            recaps.add(recap);
        }

        System.out.println("\nRécapitulatif des commandes :");
        for (String recap : recaps) {
            System.out.println(recap);
        }

        scan.close();
        System.out.println("Merci pour vos commandes, et à bientôt !");
    }
}
