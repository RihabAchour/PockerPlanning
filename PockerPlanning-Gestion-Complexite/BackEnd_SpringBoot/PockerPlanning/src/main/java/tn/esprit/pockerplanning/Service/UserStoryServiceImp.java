package tn.esprit.pockerplanning.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.pockerplanning.Interface.UserStoryService;
import tn.esprit.pockerplanning.entities.Card;
import tn.esprit.pockerplanning.entities.Project;
import tn.esprit.pockerplanning.entities.User;
import tn.esprit.pockerplanning.entities.UserStory;
import tn.esprit.pockerplanning.repositories.CardRepository;
import tn.esprit.pockerplanning.repositories.UserStoryRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserStoryServiceImp implements UserStoryService {
    private final UserStoryRepository userStoryRepo;
    private final CardRepository cardRepo;
    private final UserStoryRepository userRepo;
    @Override
    public  List<UserStory> FindAllUserStory() {
        return (List<UserStory>) userStoryRepo.findAll();
    }

    @Override
    public UserStory FindUserStoryById(long id) {
        return userStoryRepo.findById(id).orElse(null);
    }

   @Transactional
    @Override
    public UserStory AssignCardToUserStory(long idUser,long idCard, long idUserStory) {
      Card card = cardRepo.findById(idCard).orElse(null);
        UserStory userStory=userStoryRepo.findById(idUserStory).orElse(null);
       // Récupérer le projet associé au sprint de l'histoire utilisateur
       Project project = userStory.getSprint().getProject();
       // Récupérer l'utilisateur à partir du projet
       User user = project.getUserSet().stream()
               .filter(u -> u.getId() == idUser)
               .findAny()
               .orElse(null);

       userStory.getCardSet().add(card);
        userStory = userStoryRepo.save(userStory);
        return userStory;
    }
    @Transactional
    @Override
    public List<Card> getCardsByUserStoryId(Long userStoryId) {
        return userStoryRepo.findCardsByUserStoryId(userStoryId);
    }

}
