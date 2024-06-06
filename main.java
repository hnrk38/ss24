import automat.*; //Diese Stelle auskommentieren, wenn man Automat-Methoden aufrufen bzw Objekte erzeugen möchte

/* Infos aus der VL (Rückfragen):
- Erst Methoden runterschreiben und initialisieren.
Dann überlege ich mir, wie ich vorgehen will.
Brauche ich Konstruktoren? Wenn ja, welche Parameter brauchen die?
Richtwert: WEnn ich best. Attribute habe, muss ich die auch übergeben an iwas?
Deshalb bspw Münzsystem: Was passiert wenn ich zwei int arrays übergeben bekomme. brauche ich die überhaupt?
Beim Validcoins Array ja, beim currentcoins nein.

Für die Ware muss ich alles definieren und diese Paramter müssen auch übergeben werden.

Automat kompliziert, weil man überlegen muss was übergeben wird und was nicht.
Komposition heißt hier, dass die Ware und das Münzsystem nur existieren, wenn der Automat existiert.
-> wenn ich die in der main aufrufe, muss der automat genügend infos haben, mit denen er arbeiten kann.
ID müsste der automat erstellen.

Wenn man die Konstruktoren hat -> get/set-Methoden mahcen.
Vielleicht ergeben sich aus denen, die ich direkt schreibe, noch Bedarf nach anderen Methoden. Sollte aber möglichst begrenzt werden.

viel system out print nutzen, um fehler zu erkennen bzw zu schauen, ob dinge korrekt ausgegeben werden.

Über Sinn und Verwendung der Variablen, die man zB in Methoden erstellt, nachdenken und die einzelnen Schritte durchgehen.
Gibt es Sonderfälle, die ich berücksichtigen muss? */

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


/* Waren anzeigen lassen */

    Automat.printware();

/* Münzen einwerfen (mindestens eine ungültige) */
    msystem.insertCoin(50);
    msystem.insertCoin(150);
    msystem.insertCoin(200);

/* reset anfordern (reset-Methode) */

    msystem.reset();

/* genügend Münzen einwerfen, um anschließend eine Ware zu kaufen. */
    msystem.insertCoin(50);
    msystem.insertCoin(200);
    msystem.insertCoin(100);

    Automat.select(2);

}
