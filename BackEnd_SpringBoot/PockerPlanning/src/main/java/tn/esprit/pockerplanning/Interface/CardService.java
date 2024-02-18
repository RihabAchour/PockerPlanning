package tn.esprit.pockerplanning.Interface;

import tn.esprit.pockerplanning.entities.Card;
import tn.esprit.pockerplanning.entities.UserStory;

import java.util.List;

public interface CardService {


    Card addCard (Card c);
    Card UpdateCard (Card c);
    List<Card> FindAllCard ();
    Card FindCardById(long id);
    void DeleteCard (long id);

}
