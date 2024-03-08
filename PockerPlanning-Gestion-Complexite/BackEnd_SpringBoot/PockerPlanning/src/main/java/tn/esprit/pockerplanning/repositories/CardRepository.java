package tn.esprit.pockerplanning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.pockerplanning.entities.Card;
import tn.esprit.pockerplanning.entities.Note;
import tn.esprit.pockerplanning.entities.UserStory;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {

}
