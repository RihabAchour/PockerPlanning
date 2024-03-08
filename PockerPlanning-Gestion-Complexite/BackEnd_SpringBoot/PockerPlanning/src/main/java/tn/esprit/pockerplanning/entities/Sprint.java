package tn.esprit.pockerplanning.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long id;

    String name;
    LocalDate startDate;
    LocalDate endDate;
    int duration;
    String objective;


    @ManyToOne
    @JsonBackReference
    Project project;

    @OneToOne
    Session session;
    @JsonManagedReference
    @OneToMany(mappedBy = "sprint",cascade = CascadeType.ALL)
    Set<UserStory> userStorySet;

}
