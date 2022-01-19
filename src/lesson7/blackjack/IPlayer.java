package lesson7.blackjack;

public interface IPlayer {

    void addCardToHand(Card card);

    boolean needsMoreCard();

    int valueHand();

    void openHand();


}
