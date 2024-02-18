package tn.esprit.pockerplanning.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pockerplanning.Interface.NoteService;
import tn.esprit.pockerplanning.entities.Note;
import tn.esprit.pockerplanning.repositories.NoteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImp implements NoteService {

   public final NoteRepository noteRepo;
    @Override
    public Note addNote(Note n) {
        return noteRepo.save(n);
    }

    @Override
    public Note UpdateNote(Note n) {
        return noteRepo.save(n);
    }

    @Override
    public List<Note> FindAllNote() {
        return (List<Note>)noteRepo.findAll();
    }

    @Override
    public Note FindNoteById(long id) {
        return noteRepo.findById(id).orElse(null);
    }

    @Override
    public void DeleteNote(long id) {
         noteRepo.deleteById(id);
    }
}
