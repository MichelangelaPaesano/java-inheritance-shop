package Carrello;

import java.util.ArrayList;
import java.util.Scanner;
import prodotto.Prodotto;
import sottoProdotti.Cuffie;
import sottoProdotti.Smartphone;
import sottoProdotti.Televisori;

public class Carrello {
    public static void main(String[] args) {

        //Creo variabili che poi uso nell'if 
        String nome;
        String marca;
        Double prezzo;

        ////interagiamo con utente per chiedere cosa vuole inserire nel carrello
        Scanner scan = new Scanner(System.in);
        System.out.println("Quale prodotto vuoi aggiungere al carrello?");
        String domanda = scan.nextLine();

        //creo attalist dinamico, così che a mano a mano posso inserire i prodotti
        ArrayList<Prodotto> prodotti = new ArrayList<>();

        //creo le condizioni per la quale l'utente sceglie e in base alla scelta decide anche le caratteristiche 
        if (domanda.equals("Smartphone")) {
            System.out.println("Quale modello vuoi acquistare?");
            nome = scan.nextLine();
            System.out.println("Quale Marca di telefono vuoi acquistare?");
            marca = scan.nextLine();
            System.out.println("Quanto vuoi spendere?");
            prezzo = scan.nextDouble();
            //scan.nextLine dopo il double è per un bug 
            scan.nextLine();
            //creo oggetto direttamente nell'if
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

        //ciclo for each per gli elementi che vengono inseriti e con print del ToString 
        for (Prodotto elemento : prodotti) {
            System.out.println(elemento.toString());
        }
    } 

    }
   



