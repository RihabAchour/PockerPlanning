package tn.esprit.pockerplanning.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pockerplanning.Interface.CardService;
import tn.esprit.pockerplanning.entities.Card;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("card")
public class CardController {
    private final CardService cardService;
    @PostMapping("/addCard")
    public Card addCard(@RequestBody Card c){
        return cardService.addCard(c);
    }
    @DeleteMapping("/{id}/{idUserStory}")
    public void delete(@PathVariable long id,@PathVariable long idUserStory){
        cardService.DeleteCard(id,idUserStory);
    }
     @PutMapping("/UpdateCard")
   public Card UpdateCard(@RequestBody Card c){
        return  cardService.UpdateCard(c);
     }
     @GetMapping("/GetAllCard")
     public List<Card> GetAllCard(){
        return  cardService.GetAllCard();
     }

}
