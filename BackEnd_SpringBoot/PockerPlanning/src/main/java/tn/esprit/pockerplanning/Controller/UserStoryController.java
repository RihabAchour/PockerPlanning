package tn.esprit.pockerplanning.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pockerplanning.Interface.UserStoryService;
import tn.esprit.pockerplanning.entities.User;
import tn.esprit.pockerplanning.entities.UserStory;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("userStory")
public class UserStoryController {
    private  final UserStoryService userStoryService;
    @PostMapping
    public UserStory addUserStory(@RequestBody UserStory userStory){
        return  userStoryService.addUserStory(userStory);

    }
    @PutMapping
    public UserStory UpdateUserStory(@RequestBody UserStory userStory){
        return userStoryService.UpdateUserStory(userStory);

    }
    @GetMapping
    public List<UserStory> findAll(){
    return userStoryService.FindAllUserStory();

    }
    @GetMapping("/{id}")
    public UserStory findById(@PathVariable long id){
        return userStoryService.FindUserStoryById(id);
    }
    @DeleteMapping("/{id}")
    public void Delete(@PathVariable long id){
        userStoryService.DeleteUserStory(id);
    }

}
