package prodotto;

import java.util.Random;

public class Prodotto {
    //mettiamo pvt gli attributi della classe 
    private int codice;
    private String nome; 
    private String marca;
    private int prezzo;
    private int iva; 

    //creo il costruttore
    public Prodotto(String nome, int prezzo) {
        //con this assegniamo al campo privato "nome" (per esempio) il valore che arriva dal 
        //parametro del costruttore
        this.nome = nome;
        this.prezzo = prezzo; 

        //creo un metodo per creare il codice
        Random random = new Random();
        codice = random.nextInt(1000);
        System.out.println(codice);
    }

    public int getCodice() {
        return codice;
    }
}
