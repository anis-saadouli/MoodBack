package mood.sof.humeur.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@Table(name = "humeur_s") // Specify the table name
public class Humeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "lib_humeur", nullable = false)
    private String lib_humeur;
    @JsonIgnore
    @OneToMany(mappedBy = "humeur")
    private List<Mood> moods;

    // Getters and setters, constructors, etc.
}