package com.app.prTracker.entity.exercises.running;

import com.app.prTracker.entity.exercises.Running;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class RunHalfMarathon extends Running {

    public RunHalfMarathon(LocalDate scoreDate, Long runningTime) {
        super(scoreDate, runningTime);
    }

    public RunHalfMarathon() {
        setDistanceInKm(21);
    }
}
