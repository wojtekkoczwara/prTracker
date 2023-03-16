package com.app.prTracker.service;

import com.app.prTracker.dao.ExerciseRepository;
import com.app.prTracker.entity.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private ExerciseRepository disciplineDao;


    @Autowired
    public ExerciseServiceImpl(ExerciseRepository disciplineDao) {
        this.disciplineDao = disciplineDao;
    }



    @Override
    public List<Exercise> findAll() {
        return disciplineDao.findAll( Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Exercise findById(int id) {
        Exercise exercise = null;
        try {
            Optional<Exercise> result = disciplineDao.findById(id);
            exercise = result.get();
        } catch (RuntimeException e){

        }
        return exercise;
    }

    @Override
    public void save(Exercise exercise) {
        disciplineDao.save(exercise);
    }

    @Override
    public void deleteById(int id) {
        disciplineDao.deleteById(id);
    }
}
