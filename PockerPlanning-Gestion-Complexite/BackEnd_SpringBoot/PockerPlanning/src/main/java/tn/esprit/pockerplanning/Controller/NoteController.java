package tn.esprit.pockerplanning.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pockerplanning.Interface.NoteService;
import tn.esprit.pockerplanning.Interface.UserStoryService;
import tn.esprit.pockerplanning.entities.Note;
import tn.esprit.pockerplanning.entities.UserStory;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequiredArgsConstructor
@RequestMapping("note")
public class NoteController {
    public  final NoteService noteService;
    public final UserStoryService userStoryService;
    @PostMapping("/AddNoteAssignNoteToUserStory/{idUser}/{idUserStory}")
    public Note AddNoteAssignNoteToUserStory(@RequestBody Note note,@PathVariable long idUser ,@PathVariable long idUserStory){
        return noteService.AddNoteAssignNoteToUserStory(note,idUser,idUserStory);
    }
    @GetMapping("/findNoteByUserStory/{idUserStory}")
    public List<Note> findNoteByUserStory(@PathVariable  long idUserStory) {
        return noteService.findNoteByUserStory(idUserStory);
    }
    @GetMapping("/NbNoteByUserStory/{id}")
    public long NbNoteByUserStory(@PathVariable long id) {
        return  noteService.NbNoteByUserStory(id);
    }

    @PutMapping("/updateNoteOfUserStory")
    public Note updateNoteOfUserStory(@RequestBody Note note){

        return  noteService.updateNoteOfUserStory(note);
    }

    @DeleteMapping("/DeleteNoteOfUserStory/{id}")
   public  void DeleteNoteOfUserStory(Long id){
         noteService.DeleteNoteOfUserStory(id);    }

}
