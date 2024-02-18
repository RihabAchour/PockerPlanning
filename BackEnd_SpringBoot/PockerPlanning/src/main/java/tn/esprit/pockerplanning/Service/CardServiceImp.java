package tn.esprit.pockerplanning.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pockerplanning.Interface.CardService;
import tn.esprit.pockerplanning.Interface.UserStoryService;
import tn.esprit.pockerplanning.entities.Card;
import tn.esprit.pockerplanning.repositories.CardRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImp implements CardService {
   public final CardRepository cardRepo;
    @Override
    public Card addCard(Card c) {
        return cardRepo.save(c);
    }

    @Override
    public Card UpdateCard(Card c) {
        return cardRepo.save(c);
    }

    @Override
    public List<Card> FindAllCard() {
        return (List<Card>)cardRepo.findAll();
    }

    @Override
    public Card FindCardById(long id) {
        return cardRepo.findById(id).orElse(null);
    }

    @Override
    public void DeleteCard(long id) {
      cardRepo.deleteById(id);
    }
}
