package mood.sof.humeur.service;

import mood.sof.humeur.model.Humeur;
import mood.sof.humeur.repository.HumeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HumeurService {
    private final HumeurRepository humeurRepository;

    @Autowired
    public HumeurService(HumeurRepository humeurRepository) {
        this.humeurRepository = humeurRepository;
    }

    // Implement methods to fetch Humeur by ID or other criteria
}
