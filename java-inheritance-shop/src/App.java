
import sottoProdotti.Cuffie;
import sottoProdotti.Smartphone;
import sottoProdotti.Televisori;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        //CREAZIONE PRODOTTO SMARTPHONE
        Smartphone tel1 = new Smartphone("s21", 650.00, "1234567891013", 16);
        System.out.println("Il codice è: " + tel1.getCodice());
        System.out.println("Il nome dello Smartphone è: " + tel1.getNome());
        System.out.println("Il prezzo base dello Smartphone è: " + tel1.getPrezzo());
        System.out.println("Il codice IMEI dello Smartphone è: " + tel1.getImei());
        System.out.println("La memoria dello Smartphone è di: " + tel1.getMemoria() + "GB");
        
        tel1.setIva(22);
        tel1.setMarca("Samsung");

        System.out.println("il prezzo finale è: " + tel1.prezzoFinale());


        //CREAZIONE PRODOTTO TV 
        Televisori tv1 = new Televisori("Xiaomi TV", 1542.25, 42, true);
        System.out.println("Il codice è: " + tv1.getCodice());
        System.out.println("Il nome della tv è: " + tv1.getNome());
        System.out.println("Il prezzo base è: " + tv1.getPrezzo());
        System.out.println("Le dimensioni della tv sono di: " + tv1.getDimensioni());
        System.out.println("La tv è smart: " + (tv1.isSmart() ? "Sì" : "No"));

        tv1.setMarca("Xiaomi");
        tv1.setIva(22);

        System.out.println("il prezzo finale è: " + tv1.prezzoFinale());

        //CREO LE CUFFIE
        Cuffie c1 = new Cuffie("G435", 50, "nero", true);
        System.out.println("Il codice è: " + c1.getCodice());
        System.out.println("Il nome delle cuffie è: " + c1.getNome());
        System.out.println("Il prezzo base è: " + c1.getPrezzo());
        System.out.println("il colore è: " + c1.getColore());
        System.out.println("Le cuffie sono wireless: " + (c1.isWireless() ? "Sì" : "No"));

        c1.setMarca("Logitech");
        c1.setIva(22);

        System.out.println("il prezzo finale è: " + c1.prezzoFinale());
    }
}
