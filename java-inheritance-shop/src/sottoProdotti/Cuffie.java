package sottoProdotti;

import prodotto.Prodotto;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean wireless;

public Cuffie(String nome, double prezzo, String colore, boolean wireless) {
    super (nome, prezzo);
    this.colore = colore;
    this.wireless = wireless; 
}

public String getColore () {
    return colore;
}

public boolean isWireless () {
    return wireless;
}
}

