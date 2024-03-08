package tn.esprit.pockerplanning.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pockerplanning.Interface.UserStoryService;
import tn.esprit.pockerplanning.Service.UserStoryServiceImp;
import tn.esprit.pockerplanning.entities.Card;
import tn.esprit.pockerplanning.entities.UserStory;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
@RequestMapping("userStory")
public class UserStoryController {
    private  final UserStoryService USService;
    @GetMapping("/ListUserStory")
    public List<UserStory> getAllUserStory(){
        return USService.FindAllUserStory();
    }
    @GetMapping("/{id}")
    public UserStory findUserStoryById(@PathVariable long id){
        return USService.FindUserStoryById(id);
    }
    @PostMapping("/{idUser}/{idUserStory}/{idCard}")
    public UserStory AssignCardToUserStory(@PathVariable long idUser,@PathVariable long idUserStory,@PathVariable long idCard)
    {
        return USService.AssignCardToUserStory(idUser,idUserStory,idCard);
    }

     @GetMapping ("/getCardsByUserStoryId/{userStoryId}")
    public  List<Card> getCardsByUserStoryId( @PathVariable long userStoryId){
    return USService.getCardsByUserStoryId(userStoryId);
}
}
