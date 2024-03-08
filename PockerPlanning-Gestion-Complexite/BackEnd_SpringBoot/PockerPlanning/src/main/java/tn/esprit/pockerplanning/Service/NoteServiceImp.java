package tn.esprit.pockerplanning.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pockerplanning.Interface.NoteService;
import tn.esprit.pockerplanning.entities.Note;
import tn.esprit.pockerplanning.entities.User;
import tn.esprit.pockerplanning.entities.UserStory;
import tn.esprit.pockerplanning.repositories.NoteRepository;
import tn.esprit.pockerplanning.repositories.UserStoryRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class NoteServiceImp implements NoteService {
    public final NoteRepository noteRepository;
    public final UserStoryRepository userStoryRepository;
    private final UserStoryRepository userRepo;
    @Override
    public Note AddNoteAssignNoteToUserStory(Note note,long idUser, long idUserStory) {
        User user = userStoryRepository.findUserIdByUserStoryId(idUser);
        UserStory userStory=userStoryRepository.findById(idUserStory).orElse(null);
        note.setUserStory(userStory);
        noteRepository.save(note);
        return note;
    }

    @Override
    @Transactional
    public List<Note> findNoteByUserStory(long idUserStory) {
        return noteRepository.findByUserStoryId(idUserStory);
    }

    @Override
    public long NbNoteByUserStory(long id) {
        return noteRepository.countByUserStoryId(id);
    }

    @Override
    public Note updateNoteOfUserStory(Note note) {

        return noteRepository.save(note) ;
    }

    @Override
    public void DeleteNoteOfUserStory(Long id) {
        noteRepository.deleteById(id);
    }


}
