package mood.sof.humeur.service;

import mood.sof.humeur.model.User;

import java.util.List;

public interface UserService {
    List<User> findallusers();
    User findBymatricule(String matricule);


    void add(User user);
}
