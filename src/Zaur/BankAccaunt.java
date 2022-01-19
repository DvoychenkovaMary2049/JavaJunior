package Zaur;

public class BankAccaunt {
    int id = 5;
    String name = "Oleg";
    double balance = 100;

    void PopolnenieScheta(double summaPopolneniya) {
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс увеличился на: " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Баланс после пополнения: " + balance);
        System.out.println();

    }

    void SnyatieSoScheta(double summaSnyatiya) {
        System.out.println("Баланс дял снятия: " + balance);
        System.out.println("Баланс увеличился на: " + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Баланс после снятия:" + balance);
        System.out.println();
    }
}
