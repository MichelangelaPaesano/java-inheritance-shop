package sottoProdotti;

import prodotto.Prodotto;

public class Smartphone extends Prodotto {
    private String imei; 
    private int memoria;

public Smartphone(String nome, double prezzo, String imei, int memoria) {
    super(nome, prezzo);
    this.imei = imei;
    this.memoria = memoria;
}

public String getImei () {
    return imei; 
}

public void setImei (String imei) {
    if (imei.length() == 15) {
        this.imei = imei;
    } else {
        System.out.println("Il codice imei inserito non è valido");
    }
}

public int getMemoria () {
    return memoria;
}

/**
 * @param memoria
 */
public void setMemoria (int memoria) {
    if (memoria >= 8 && memoria < 1024) {
        this.memoria = memoria;
    } else {
        System.out.println("La memoria inserita non è valida");
    }
}

@Override
public String toString() {
    return "IMEI: " + getImei() + ", Memoria:" + getMemoria();
}

}
