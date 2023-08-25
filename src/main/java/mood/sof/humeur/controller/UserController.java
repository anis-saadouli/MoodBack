package mood.sof.humeur.controller;

import mood.sof.humeur.model.User;
import mood.sof.humeur.model.UserLoginRequest;
import mood.sof.humeur.model.LoginResponse;
import mood.sof.humeur.service.PasswordHasher;
import mood.sof.humeur.service.UserService;
import mood.sof.humeur.Exeption.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService, PasswordHasher passwordHasher) {
        this.userService = userService;
        this.passwordHasher = passwordHasher;
    }
    final PasswordHasher passwordHasher;
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody UserLoginRequest loginRequest) {
        String matricule = loginRequest.getMatricule();
        String mdp = loginRequest.getMdp(); // Use "mdp" instead of "password"

        try {
            User user = userService.findBymatricule(matricule);
            if (user.getMdp().equals(passwordHasher.hashPassword(mdp))) { // Use "mdp" instead of "password"
                return new ResponseEntity<>(new LoginResponse(true, user.getRole()), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new LoginResponse(false, ""), HttpStatus.OK);
            }
        } catch (UserNotFoundException e) {
            return new ResponseEntity<>(new LoginResponse(false, ""), HttpStatus.OK);
        }
    }
    @PostMapping("/register")
    public void add(@RequestBody User user)
    {
        String ps =user.getMdp();
        String psn = passwordHasher.hashPassword(ps);
        user.setMdp(psn);
        userService.add(user);

    }


    @GetMapping("/allusers")
    public List<User> getallusers () {
        return userService.findallusers();
    }
}
