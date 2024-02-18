package tn.esprit.pockerplanning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pockerplanning.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}