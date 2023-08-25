package mood.sof.humeur.service;

import mood.sof.humeur.model.User;
import mood.sof.humeur.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewUserService {
    private final UserRepository userRepository;

    @Autowired
    public NewUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserBymatricule(String matricule) {
        return userRepository.findBymatricule(matricule);
    }
}
