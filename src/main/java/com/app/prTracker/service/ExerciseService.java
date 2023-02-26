package com.app.prTracker.service;

import com.app.prTracker.entity.Exercise;

import java.util.List;

public interface ExerciseService {

    public List<Exercise> findAll();
    public Exercise findById(int id);
    public void save(Exercise exercise);
    public void deleteById(int id);

}
