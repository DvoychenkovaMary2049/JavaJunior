package lesson7.blackjack;

public interface IGame {
    void addPlayerToGame(Player player);

    void dealPlayersCards ();

    void dealMainRound ();

    void printWinner ();


}
