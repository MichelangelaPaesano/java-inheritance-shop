package sottoProdotti;

import prodotto.Prodotto;

public class Televisori extends Prodotto {
    private int dimensioni; 
    private String smart; 


public Televisori () {
    super ("Samsung", 1870);
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

public String getSmart () {
    return smart;
}
}
