import automat.*; //Diese Stelle auskommentieren, wenn man Automat-Methoden aufrufen bzw Objekte erzeugen möchte

public class main{
    
    public static void main(String[] args){
        /*
         * Ab hier soll die main-Methode, wie auf dem Aufgabenblatt beschrieben, implementiert werden.
         */
        Muenzsystem msystem = new Muenzsystem();
        Automat automat = new Automat(inv);
        msystem.AusgabeArrays();
        msystem.reset();
    }

/* Waren erstellen */

/* Münzen einwerfen (mindestens eine ungültige) */

/* reset anfordern (reset-Methode) */

/* genügend Münzen einwerfen, um anschließend eine Ware zu kaufen. */
}
