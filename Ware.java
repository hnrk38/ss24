package automat;

//Ab hier soll die Ware implementiert werden
public class Ware {

    public int getId() {    // Abfrage Produkt-ID
        return id;
    }

    public void setID() {
        this.id = id;
    }

    public String getName() {   // Abfrage Produktname
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getPrice() {   // Abfrage Produktpreis
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public int getStock() {   // Abfrage des aktuellen Guthabens
        return stock;
    }

    public void setStock() {
        this.stock = stock;
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