package sottoProdotti;

import prodotto.Prodotto;

public class Televisori extends Prodotto {
    private int dimensioni; 
    private boolean isSmart; 


public Televisori (String nome, String marca, double prezzo) {
    super (nome, marca, prezzo);
}

public int getDimensioni () {
    return dimensioni;
}

public void setDimensioni (int dimensioni) {
    if (dimensioni >= 15 && dimensioni <=100) {
        this.dimensioni = dimensioni;
    } else {
        System.out.println("Le dimensioni inserite non sono valide");
    }
}

public boolean isSmart () {
    return isSmart;
}

//facciamo override
@Override
public String toString() {
    return super.toString() + "Dimensioni: " + getDimensioni() + ", Smart: " + isSmart();
}
}
