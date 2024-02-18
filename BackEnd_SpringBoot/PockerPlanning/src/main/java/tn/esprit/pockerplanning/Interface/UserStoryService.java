package tn.esprit.pockerplanning.Interface;

import tn.esprit.pockerplanning.entities.UserStory;

import java.util.List;

public interface UserStoryService {

    UserStory addUserStory (UserStory us);
    UserStory UpdateUserStory (UserStory us);
    List <UserStory> FindAllUserStory ();
    UserStory FindUserStoryById(long id);
    void DeleteUserStory (long id);

}
