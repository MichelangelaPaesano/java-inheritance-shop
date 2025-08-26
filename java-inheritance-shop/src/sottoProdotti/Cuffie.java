package sottoProdotti;

import prodotto.Prodotto;

public class Cuffie extends Prodotto{
    private String colore;
    private String wireless;

public Cuffie() {
    super ("JBL", 170);
}

public String getColore () {
    return colore;
}

public String getWireless () {
    return wireless;
}
}

