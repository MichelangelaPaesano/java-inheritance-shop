package Carrello;

import java.util.ArrayList;
import java.util.Scanner;
import prodotto.Prodotto;
import sottoProdotti.Cuffie;
import sottoProdotti.Smartphone;
import sottoProdotti.Televisori;

public class Carrello {
    public static void main(String[] args) {

        //interagiamo con utente per chiedere cosa vuole inserire nel carrello
        String nome;
        String marca;
        Double prezzo;

        Scanner scan = new Scanner(System.in);
        System.out.println("Quale prodotto vuoi aggiungere al carrello?");
        String domanda = scan.nextLine();

        ArrayList<Prodotto> prodotti = new ArrayList<>();

        if (domanda.equals("Smartphone")) {
            System.out.println("Quale modello vuoi acquistare?");
            nome = scan.nextLine();
            System.out.println("Quale Marca di telefono vuoi acquistare?");
            marca = scan.nextLine();
            System.out.println("Quanto vuoi spendere?");
            prezzo = scan.nextDouble();
            scan.nextLine();
            Smartphone cell1 = new Smartphone(nome, marca, prezzo);
            prodotti.add(cell1);
        } else if (domanda.equals("Televisore")) {
            System.out.println("Quale modello vuoi acquistare?");
            nome = scan.nextLine();
            System.out.println("Quale Marca di tekevisori vuoi acquistare?");
            marca = scan.nextLine();
            System.out.println("Quanto vuoi spendere?");
            prezzo = scan.nextDouble(); 
            scan.nextLine(); 
            Televisori tv1 = new Televisori(nome, marca, prezzo);
            prodotti.add(tv1); 
        } else if (domanda.equals("Cuffie")) {
             System.out.println("Quale modello?");
            nome = scan.nextLine();
            System.out.println("Quale Marca di cuffie vuoi acquistare?");
            marca = scan.nextLine();
            System.out.println("Quanto vuoi spendere?");
            prezzo = scan.nextDouble(); 
            scan.nextLine();
            Cuffie c1 = new Cuffie(nome, marca, prezzo);
            prodotti.add(c1);
        }

        for (Prodotto elemento : prodotti) {
            System.out.println(elemento.toString());
        }
    } 

    }
   



