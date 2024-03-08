package tn.esprit.pockerplanning.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pockerplanning.Interface.CardService;
import tn.esprit.pockerplanning.entities.Card;
import tn.esprit.pockerplanning.entities.UserStory;
import tn.esprit.pockerplanning.repositories.CardRepository;
import tn.esprit.pockerplanning.repositories.UserStoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImp implements CardService {
    public final CardRepository cardRepository;
    private final UserStoryRepository userStoryRepo;
    @Override
    public Card addCard(Card c) {
        return cardRepository.save(c);
    }

    @Override
    public Card UpdateCard(Card c) {
        return cardRepository.save(c);
    }

    @Override
    public void DeleteCard(long id, long idUserStory) {
        UserStory userStory = userStoryRepo.findById(idUserStory).orElse(null);

        if (userStory != null) {
            userStory.getCardSet().removeIf(card -> card.getId() == id);
            userStoryRepo.save(userStory);
        }

        cardRepository.deleteById(id);
    }

    @Override
    public List<Card> GetAllCard() {
        return cardRepository.findAll();
    }
}
