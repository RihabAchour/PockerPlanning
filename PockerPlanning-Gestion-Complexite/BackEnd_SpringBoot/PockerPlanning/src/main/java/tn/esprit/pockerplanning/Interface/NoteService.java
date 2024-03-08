package tn.esprit.pockerplanning.Interface;

import tn.esprit.pockerplanning.entities.Note;

import java.util.List;

public interface NoteService {
    Note AddNoteAssignNoteToUserStory(Note note,long idUser, long idUserStory);
    List<Note> findNoteByUserStory(long idUserStory);
    long NbNoteByUserStory(long id);
    Note updateNoteOfUserStory(Note note);
    void DeleteNoteOfUserStory(Long id);

}
