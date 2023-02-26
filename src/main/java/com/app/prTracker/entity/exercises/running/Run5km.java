package com.app.prTracker.entity.exercises.running;

import com.app.prTracker.entity.exercises.Running;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Run5km extends Running {


    public Run5km(LocalDate scoreDate, Long runningTime) {
        super(scoreDate, runningTime);}

    public Run5km() {
        setDistanceInKm(5);
    }


}
