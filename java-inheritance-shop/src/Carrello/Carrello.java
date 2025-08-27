package Carrello;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        //interagiamo con utente per chiedere cosa vuole inserire nel carrello
        Scanner scan = new Scanner(System.in);
        System.out.println("Quale prodotto vuoi aggiungere al carrello?");
        String domanda = scan.nextLine();

        if (domanda.equals("Smartphone")) {
            System.out.println("Quale Marca di telefono vuoi acquistare?");
            String marca = scan.nextLine();

            System.out.println("Quale modello vuoi acquistare?");
            String modello = scan.nextLine();

            System.out.println("Quanto vuoi spendere?");
            int prezzo = scan.nextInt();
        } else if (domanda.equals("Televisore")) {
            System.out.println("Quale Marca di tekevisori vuoi acquistare?");
            String marca = scan.nextLine();

            System.out.println("Quale modello vuoi acquistare?");
            String modello = scan.nextLine();

            System.out.println("Quanto vuoi spendere?");
            int prezzo = scan.nextInt();
            
        } else if (domanda.equals("Cuffie")) {
            System.out.println("Quale Marca di cuffie vuoi acquistare?");
            String marca = scan.nextLine();

            System.out.println("Quale modello?");
            String modello = scan.nextLine();

            System.out.println("Quanto vuoi spendere?");
            int prezzo = scan.nextInt();
            
        }
    } 

    }
   



