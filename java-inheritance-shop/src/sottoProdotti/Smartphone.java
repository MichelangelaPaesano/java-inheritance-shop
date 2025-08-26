package sottoProdotti;

import prodotto.Prodotto;

public class Smartphone extends Prodotto {
    private int imei; 
    private int memoria;

public Smartphone(int imei, int memoria) {
    super( "S21", 650);
    this.imei = imei;
    this.memoria = memoria;
}

public int getImei () {
    return imei; 
}

public void setImei (int imei) {
    if (imei == 15 && imei > 0) {
        this.imei = imei;
    } else {
        System.out.println("Il codice imei inserito non è valido");
    }
}

public int getMemoria () {
    return memoria;
}

public void setMemoria (int memoria) {
    if (memoria >= 8 && memoria < 1024) {
        this.memoria = memoria;
    } else {
        System.out.println("La memoria inserita non è valida");
    }
}

}
