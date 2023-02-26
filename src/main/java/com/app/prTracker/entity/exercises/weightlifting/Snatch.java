package com.app.prTracker.entity.exercises.weightlifting;

import com.app.prTracker.entity.exercises.Weightlifting;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Snatch extends Weightlifting {

//    private double prWeight;


    public Snatch(LocalDate scoreDate, double prWeight) {
        super(scoreDate, prWeight);
//        this.prWeight = prWeight;
    }


    public Snatch() {
    }

//    public double getPrWeight() {
//        return prWeight;
//    }
//
//    public void setPrWeight(double prWeight) {
//        this.prWeight = prWeight;
//    }
}
