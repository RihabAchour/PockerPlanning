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
    @PostMapping
    public Card addCard(@RequestBody Card card){
        return cardService.addCard(card);
    }
    @PutMapping
    public Card updateCard(@RequestBody Card card){
        return cardService.UpdateCard(card);

    }
    @GetMapping
    public List<Card> findAll(){
        return cardService.FindAllCard();
    }
    @GetMapping("/{id}")
    public Card findById(@PathVariable long id ){
        return cardService.FindCardById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        cardService.DeleteCard(id);
    }
}
