package mood.sof.humeur.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.util.List;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Entity
@Data
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String matricule;
    private String nom;
    private String prenom;
    private String mdp;
    private String role;

    @ManyToOne
    @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")
    private departement departement;
    @JsonIgnore
    @OneToMany(mappedBy = "user")
private List<Mood> moods;    // Getters and setters (generated or written manually)
    // Constructors (generated or written manually)
}
