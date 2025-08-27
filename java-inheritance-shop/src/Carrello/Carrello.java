package Carrello;

import java.util.ArrayList;
import java.util.Scanner;

import sottoProdotti.Cuffie;
import sottoProdotti.Smartphone;
import sottoProdotti.Televisori;

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
        
        ArrayList<Prodotto> prodotti = new ArrayList<>();
        Smartphone cell1 = new Smartphone("S21", 1200, "123456789123456", 16);
        prodotti.add(cell1);
        Cuffie c1 = new Cuffie("Logitech", 55, "nero", true);
        Televisori tv1 = new Televisori("Xiamo Tv", 1250, 60, true);

    } 

    }
   



