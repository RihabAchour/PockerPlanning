package tn.esprit.pockerplanning.Controller;

import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Not;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pockerplanning.Interface.NoteService;
import tn.esprit.pockerplanning.entities.Note;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("note")
public class NoteController {
    private final NoteService noteService;
    @PostMapping
    public Note AddNote(@RequestBody Note note){
        return noteService.addNote(note);

    }
    @PutMapping
    public Note UpdateNote(@RequestBody  Note note){
        return noteService.UpdateNote(note);
    }
    @GetMapping
    public List<Note> findAll(){
        return noteService.FindAllNote();
    }
    @GetMapping("/{id}")
    public Note findById(@PathVariable long id){
        return noteService.FindNoteById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id )
    {
        noteService.DeleteNote(id);
    }
}
