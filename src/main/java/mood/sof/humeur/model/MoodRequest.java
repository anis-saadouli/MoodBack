package mood.sof.humeur.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class MoodRequest {
    private String matricule;
    private Long id_humeur;
    private String description;
    private LocalDateTime dateHumeur;

    // Constructors, getters, setters
}
