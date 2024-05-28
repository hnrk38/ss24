package automat;

//Ab hier soll das Muenzsystem implementiert werden
public class Muenzsystem {
    int[] validCoins = {1, 2, 5, 10, 20, 50, 100, 200}; // Alle gültigen Münzwerte
    int[] currentCoins = new int[7]; // Array von 0 bis 6, gefüllt mit dem Wert 0 zu Beginn
    int currentBalance = 0;   // can be int since we're working with whole numbers
    
    public void AusgabeArrays() {
            // Print out Arrays, kann perspektivisch weg
        for(Integer i : currentCoins){  // current balance
            System.out.print(i + " ");
        }
        for(Integer i : validCoins){    // valid coin numbers array
            System.out.print(i + " ");
        }
    }

    public void insertCoin(int coin) {
        boolean validCoin = false;
        for (int i = 0; i < validCoins.length; i++) {
            if (coin == validCoins[i]) {
                currentCoins[i]++;
                currentBalance += coin;
                validCoin = true;
                break;
            }
        }
        if (!validCoin) {
            System.out.println("Sorry, we only accept the following coin values:");
            System.out.println("1, 2, 5, 10, 20, 50, 100, 200 (you tried to put in " + coin + ")");
        }
    }

    public void reset() {
        int resetSum = 0;
            for (int i : currentCoins) {
                resetSum += i;
            }
        int currentBalance = 0;
        currentCoins = new int[7];
        System.out.println("You received your balance of " + resetSum + " coins. Your balance is now " + currentBalance + " coins.");
        System.out.println("Have a nice day!");
    }

    public void silentReset() {
        int resetSum = 0;
            for (int i : currentCoins) {
                resetSum += i;
            }
        int currentBalance = 0;
        currentCoins = new int[7];
        System.out.println("Thank you for your purchase. Enjoy your snack & have a nice day!");
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

}