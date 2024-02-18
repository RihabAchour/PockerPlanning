package tn.esprit.pockerplanning.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pockerplanning.Interface.UserStoryService;
import tn.esprit.pockerplanning.entities.UserStory;
import tn.esprit.pockerplanning.repositories.UserStoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserStoryServiceImp implements UserStoryService {
    public final UserStoryRepository userStoryRepo;
    @Override
    public UserStory addUserStory(UserStory us) {
        return userStoryRepo.save(us);
    }

    @Override
    public UserStory UpdateUserStory(UserStory us) {
        return userStoryRepo.save(us);
    }

    @Override
    public List<UserStory> FindAllUserStory() {
        return (List<UserStory>)userStoryRepo.findAll();
    }

    @Override
    public UserStory FindUserStoryById(long id) {
        return userStoryRepo.findById(id).orElse(null);
    }

    @Override
    public void DeleteUserStory(long id) {
    userStoryRepo.deleteById(id);
    }
}
