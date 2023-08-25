package mood.sof.humeur.controller;

import mood.sof.humeur.model.Mood;
import mood.sof.humeur.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import mood.sof.humeur.model.MoodRequest;
import mood.sof.humeur.service.MoodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MoodController {

    private final MoodService moodService;

    @Autowired
    public MoodController(MoodService moodService) {
        this.moodService = moodService;
    }

    @PostMapping("/addMood")
    public ResponseEntity<String> addMood(@RequestBody MoodRequest moodRequest) {
        moodService.saveMood(moodRequest);
        return ResponseEntity.ok("Mood added successfully");
    }

    // Other endpoints...

    @GetMapping("/allmoods")
    public List<Mood> getallmoods() {
        return moodService.findallmoods();
    }
}

