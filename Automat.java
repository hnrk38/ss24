package automat;

//Ab hier soll der Automat implementiert werden.
class Automat {

    Muenzsystem msystem = new Muenzsystem();
    Ware[] inv = new Ware;

    public Automat(Object[][] inventoryArr) {
        // Erstellung von Variablen, um auf die Klassen Ware und Münzsystem zuzugreifen.
        msystem = new Muenzsystem();
        inv = new Ware[inventoryArr.length];

        /* Hier iterieren wir einmal alle Stellen des Warenbestands-Arrays durch.
        Dabei werden die für den Warenbestand relevanten Parameter an den jeweiligen Stellen des Arrays platziert:
        Stelle 0: ID
        Stelle 1: Produktname
        Stelle 2: Preis
        Stelle 3: Warenbestand im Automaten */
        for (int i = 0; i < inventoryArr.length; i++) {
            int id = (int) inventoryArr[i][0];
            String name = (String) inventoryArr[i][1];
            int price = (int) inventoryArr[i][2];
            int stock = (int) inventoryArr[i][3];
            inv[i] = new Ware(id, name, price, stock);
        }
    }

    public void select(int id) {
        if (id < 1 || id > inv.length) {
            System.out.println("You entered the wrong id (" + id + ")");
            return;
        }
        Ware item = inv[id - 1];
        if (msystem.getCurrentBalance() >= inv.getPrice()) {
            if (inv.getStock() > 0) {
                msystem.reset(); // erfolgreicher Kauf -> Guthaben auf 0
                item.stockMinus();
            } else {
                System.out.println("Sorry, we're out of " + item.getName());
            }
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Übersicht aller Waren (ID, Name, Preis, Bestand)
    public void printWare() {
        for (Ware i : inv) {
            System.out.print(i + " ");
        }
    }

    // Geldrückgabe (kein Kauf), wodurch dann die reset-Methode im Münzsystem ausgelöst wird.
    public void reset() {
        msystem.reset();
    }

    // Reset nach erfolgreichem Kauf, um das restliche Guthaben nach dem Kauf auf 0 zu setzen.
    public void silentReset() {
        msystem.silentReset();
    }

    public void insert(int coin) {
        msystem.insert(coin);
    }
}