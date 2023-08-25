package mood.sof.humeur.repository;

import mood.sof.humeur.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
  //  User findByMatriculeAndPassword(String matricule, String mdp);
  Optional<User> findBymatricule(String matricule);


}