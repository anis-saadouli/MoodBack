package mood.sof.humeur.repository;

import mood.sof.humeur.model.Humeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumeurRepository extends JpaRepository<Humeur, Long> {
    // Add any custom queries if needed
}
