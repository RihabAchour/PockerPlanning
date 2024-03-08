package tn.esprit.pockerplanning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.pockerplanning.entities.Note;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    @Query("select n from Note n where n.userStory.id = :id")
    List<Note> findByUserStoryId(@Param("id") Long id);

    long countByUserStoryId(Long id);



}