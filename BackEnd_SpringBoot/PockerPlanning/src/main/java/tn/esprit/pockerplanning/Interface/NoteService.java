package tn.esprit.pockerplanning.Interface;

import tn.esprit.pockerplanning.entities.Note;
import tn.esprit.pockerplanning.entities.UserStory;

import java.util.List;

public interface NoteService {

    Note addNote (Note n);
    Note UpdateNote (Note n);
    List<Note> FindAllNote ();
    Note FindNoteById(long id);
    void DeleteNote (long id);

}
