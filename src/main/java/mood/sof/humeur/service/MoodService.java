package mood.sof.humeur.service;

import mood.sof.humeur.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mood.sof.humeur.model.Mood;
import mood.sof.humeur.model.MoodRequest;
import mood.sof.humeur.model.Humeur; // Import the Humeur class
import mood.sof.humeur.repository.MoodRepository;
import mood.sof.humeur.repository.HumeurRepository; // Import the HumeurRepository

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MoodService {

    private final MoodRepository moodRepository;
    private final NewUserService newUserService;
    private final HumeurRepository humeurRepository; // Add this field

    @Autowired
    public MoodService(MoodRepository moodRepository, NewUserService newUserService, HumeurRepository humeurRepository) {
        this.moodRepository = moodRepository;
        this.newUserService = newUserService;
        this.humeurRepository = humeurRepository; // Initialize the HumeurRepository
    }

    public Mood saveMood(MoodRequest moodRequest) {
        Mood mood = new Mood();
        mood.setDate_humeur(LocalDateTime.now());

        // Unwrap the Optional<User> to get the User object
        User user = newUserService.getUserBymatricule(moodRequest.getMatricule()).orElse(null);
        mood.setUser(user);

        // Retrieve the Humeur object from the HumeurRepository using the provided id_humeur
        Humeur humeur = humeurRepository.findById(moodRequest.getId_humeur()).orElse(null);
        mood.setHumeur(humeur);

        mood.setDescription(moodRequest.getDescription());
        return moodRepository.save(mood);
    }

    public List<Mood> findallmoods() {
        return moodRepository.findAll();
    }

    // Other methods...
}
