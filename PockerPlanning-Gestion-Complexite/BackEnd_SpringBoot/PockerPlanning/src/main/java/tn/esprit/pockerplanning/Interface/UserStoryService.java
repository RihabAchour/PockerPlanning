package tn.esprit.pockerplanning.Interface;

import tn.esprit.pockerplanning.entities.Card;
import tn.esprit.pockerplanning.entities.UserStory;

import java.util.List;

public interface UserStoryService {

    List<UserStory> FindAllUserStory();
    UserStory FindUserStoryById (long id);
    UserStory AssignCardToUserStory(long idCard ,long idUser,long idUserStory);
    List<Card> getCardsByUserStoryId(Long userStoryId);
}
