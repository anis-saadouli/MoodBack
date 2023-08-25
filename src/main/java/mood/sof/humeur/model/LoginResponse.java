package mood.sof.humeur.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class LoginResponse {
    private boolean success;
    private String role;

    public LoginResponse(boolean success, String role) {
        this.success = success;
        this.role = role;
    }

    // Constructors, getters, and setters
}