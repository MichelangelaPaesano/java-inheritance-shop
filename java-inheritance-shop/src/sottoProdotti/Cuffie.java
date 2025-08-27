package sottoProdotti;

import prodotto.Prodotto;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean wireless;

public Cuffie(String nome, String marca, double prezzo) {
    super (nome, marca, prezzo);
}

public String getColore () {
    return colore;
}

public boolean isWireless () {
    return wireless;
}

//FACCIAMO OVERRIDE TOSTRING
@Override
public String toString() {
    return super.toString() + "Colore: " + getColore() + ", Wireless: " + isWireless();
}

}

