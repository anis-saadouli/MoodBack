package mood.sof.humeur.repository;

import mood.sof.humeur.model.Mood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoodRepository extends JpaRepository<Mood, Long> {
    // Add any custom queries if needed
}
