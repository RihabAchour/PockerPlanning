package tn.esprit.pockerplanning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.pockerplanning.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  /*  @Query("SELECT u.id FROM User u " +
            "JOIN u.projectSet p " +
            "JOIN Project p2 ON p.id = p2.id " +
            "JOIN Sprint s ON p2.id = s.project.id " +
            "JOIN UserStory us ON s.id = us.sprint.id " +
            "WHERE us.id = :userStoryId")
    Long findUserIdByUserStoryId(@Param("IdUser") Long IdUser);*/
}