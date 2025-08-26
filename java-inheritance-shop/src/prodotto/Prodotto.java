package prodotto;

import java.util.Random;

public class Prodotto {
    //mettiamo pvt gli attributi della classe 
    private int codice;
    private String nome; 
    private String marca;
    private double prezzo;
    private double iva; 

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

    //rendo accessibile la lettura del "codice"
    public int getCodice() {
        return codice;
    }

    //rendo accessibile la lettura del "nome"
    public String getNome () {
        return nome;
    }

    //rendo accessibile la scrittura del "nome" -- ma vogliamo impostare un po' di controllo
    //per evitare che chiunque possa dall'esterno modificare i valori usando il setter
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.print("Il nome inserito non valido");
        } else {
            this.nome = nome;
        }
    }

    //passiamo alla marca
    public String getMarca () {
        return marca;
    }

    public void setMarca (String marca) {
        if (marca == null || marca.isEmpty()) {
            System.out.print("La marca inserita non è valida");
        } else {
            this.marca = marca; 
        }
    }

    //passiamo al prezzo
    public double getPrezzo () {
        return prezzo;
    }

    public void setPrezzo (double prezzo) {
        if (prezzo < 0) {
            System.out.println("Il prezzo inserito non è valido");
        } else {
            this.prezzo = prezzo;
        }
    }

    //passiamo all'iva
    public double getIva () {
        return iva;
    }

    public void setIva (double iva) {
        if (iva <= 100) {
            System.out.println("L'iva inserita non è valida");
        } else {
            this.iva = iva;
        }
    }
}

