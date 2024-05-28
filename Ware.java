package automat;

//Ab hier soll die Ware implementiert werden
public class Ware {

    private int id;  // ID, die der Auswahl des Produkts dient
    private String name;    // Produktname
    private int price;  // Preis in Münzen
    private int stock; // Warenbestand

    public Ware(int id, String name, int price, int stock) {   // Deklaration des Konstruktors Ware
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        System.out.println(name + " wurde erstellt!");
    }

    public int getId() {    // Abfrage Produkt-ID
        return id;
    }

    public String getName() {   // Abfrage Produktname
        return name;
    }

    public int getPrice() {   // Abfrage Produktpreis
        return price;
    }

    public int getStock() {   // Abfrage des aktuellen Guthabens
        return stock;
    }

    public void stockMinus() { // Änderung des Guthabens
        if (stock > 0) {
            stock--;
        }
    }

    public String toString() {   // Ausgabe der jeweiligen Produktinfos
        return id + ": " + name + ", each for " + price + " coins. (remaining: " + stock + ")";
    }
}