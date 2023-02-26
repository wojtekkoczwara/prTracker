package com.app.prTracker.entity.exercises.running;

import com.app.prTracker.entity.exercises.Running;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Run10km extends Running {

    public Run10km(LocalDate scoreDate, Long runningTime) {
        super(scoreDate, runningTime);
    }

    public Run10km() {
        setDistanceInKm(10);
    }
}
