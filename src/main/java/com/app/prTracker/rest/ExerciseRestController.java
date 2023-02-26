package com.app.prTracker.rest;

import com.app.prTracker.entity.Exercise;
import com.app.prTracker.rest.exceptions.ExerciseNotFoundException;
import com.app.prTracker.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExerciseRestController {

    private ExerciseService exerciseService;

    @Autowired
    public ExerciseRestController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping("/exercises")
    public List<Exercise> findAll() {return exerciseService.findAll();}

    @GetMapping("/exercises/{exerciseId}")
    public Exercise getDiscipline(@PathVariable int exerciseId){
        Exercise exercise = exerciseService.findById(exerciseId);
        if(exercise == null){
            throw new ExerciseNotFoundException("Discipline id not found - " + exerciseId);
        }
        return exercise;
    }

    @PostMapping("/exercises")
    public Exercise addDiscipline(@RequestBody Exercise exercise){
        exerciseService.save(exercise);
        return exercise;
    }

    @DeleteMapping("/exercises/{exerciseId}")
    public String deleteDiscipline(@PathVariable int exerciseId){
        Exercise exercise = exerciseService.findById(exerciseId);
        if (exercise == null){
            throw new ExerciseNotFoundException("Discipline id not found - " + exerciseId);
        }
        exerciseService.deleteById(exerciseId);
        return "Deleted exercise with exerciseId: " + exerciseId;
    }

    @GetMapping("/yolo")
    public String returnYolo(){
        System.out.println("yolo");
        return "Dziecko spi";
    }

}
