package com.app.prTracker.entity.exercises;

import com.app.prTracker.entity.Exercise;
import com.app.prTracker.entity.exercises.weightlifting.BenchPress;
import com.app.prTracker.entity.exercises.weightlifting.CleanJerk;
import com.app.prTracker.entity.exercises.weightlifting.Snatch;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
@JsonSubTypes({
        @JsonSubTypes.Type(value = Snatch.class, name="snatch"),
        @JsonSubTypes.Type(value = CleanJerk.class, name="clean jerk"),
        @JsonSubTypes.Type(value = BenchPress.class, name="bench press")

})
public abstract class Weightlifting extends Exercise {

    private double prWeight;

    public Weightlifting(LocalDate scoreDate, double prWeight) {
        super(scoreDate);
        this.prWeight = prWeight;
    }

    public Weightlifting() {
    }

    public double getPrWeight() {
        return prWeight;
    }

    public void setPrWeight(double prWeight) {
        this.prWeight = prWeight;
    }

    @Override
    public String toString() {
        return "Pr in weightlifting, exercise: " + " scored in: " + getScoreDate()
                + " , result: " + getPrWeight();
    }

}
