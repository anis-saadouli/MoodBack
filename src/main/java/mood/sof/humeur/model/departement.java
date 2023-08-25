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
public class departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_dep;
    private String lib_dep;
    @JsonIgnore
    @OneToMany(mappedBy = "departement")
    private List<User> users;    // Getters and setters (generated or written manually)
    // Constructors (generated or written manually)

}
