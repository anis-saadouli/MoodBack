package mood.sof.humeur.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
public class Mood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "matricule-id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_humeur", referencedColumnName = "id")
    private Humeur humeur;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDateTime date_humeur;

    // Getters and setters, constructors, etc.
}
