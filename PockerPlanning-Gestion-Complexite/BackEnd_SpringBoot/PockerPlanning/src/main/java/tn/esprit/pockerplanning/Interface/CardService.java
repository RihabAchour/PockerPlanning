package tn.esprit.pockerplanning.Interface;

import tn.esprit.pockerplanning.entities.Card;

import java.util.List;

public interface CardService {
    Card addCard (Card c);
    Card UpdateCard(Card c);
    void DeleteCard(long id,long idUserStory);
    List<Card> GetAllCard();
}
