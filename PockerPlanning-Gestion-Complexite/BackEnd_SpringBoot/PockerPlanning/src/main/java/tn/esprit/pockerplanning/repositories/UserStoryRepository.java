package tn.esprit.pockerplanning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.pockerplanning.entities.Card;
import tn.esprit.pockerplanning.entities.User;
import tn.esprit.pockerplanning.entities.UserStory;

import java.util.List;

public interface UserStoryRepository extends JpaRepository<UserStory, Long> {
    @Query("SELECT u.id FROM User u " +
            "JOIN u.projectSet p " +
            "JOIN Project p2 ON p.id = p2.id " +
            "JOIN Sprint s ON p2.id = s.project.id " +
            "JOIN UserStory us ON s.id = us.sprint.id " +
            "WHERE us.id = :userStoryId")
    User findUserIdByUserStoryId(@Param("userStoryId") Long userStoryId);
    @Query("SELECT u.cardSet FROM UserStory u WHERE u.id = :userStoryId")
    List<Card> findCardsByUserStoryId(@Param("userStoryId") Long userStoryId);

}