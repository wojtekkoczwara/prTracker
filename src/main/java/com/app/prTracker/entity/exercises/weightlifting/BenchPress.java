package com.app.prTracker.entity.exercises.weightlifting;

import com.app.prTracker.entity.exercises.Weightlifting;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class BenchPress extends Weightlifting {

    public BenchPress(LocalDate scoreDate, double prWeight) {
        super(scoreDate, prWeight);
    }

    public BenchPress() {
    }
}
