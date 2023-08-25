package mood.sof.humeur.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserLoginRequest {
    private String matricule;
    private String mdp;

    // Constructors, getters, and setters
}
