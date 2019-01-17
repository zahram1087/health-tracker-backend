package com.zhmohamed.healthtrackerbackend;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class ExcerciseController {
    // Create a POST route that allows creating a new Exercise

    @Autowired
    private ExcerciseRepository excerciseRepo;

    @RequestMapping(value = "/exercise", method = RequestMethod.POST)
        public void makeExcercise (@RequestParam String title,
                              @RequestParam String quantity,
                              @RequestParam String description){

        Exercise exercise = new Exercise(title, quantity,description, new Date().toString());
        excerciseRepo.save(exercise);
    }

    //GET route that responds with all Exercises currently in the database.
    @GetMapping(value = "/exercise")
    public String getExercise(){

        Gson gson = new Gson();
        String exerciseJson = gson.toJson(excerciseRepo.findAll());
        return exerciseJson;
    }

}
