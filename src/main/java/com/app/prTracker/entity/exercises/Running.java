package com.app.prTracker.entity.exercises;

import com.app.prTracker.entity.Exercise;
import com.app.prTracker.entity.exercises.running.Run10km;
import com.app.prTracker.entity.exercises.running.Run5km;
import com.app.prTracker.entity.exercises.running.RunHalfMarathon;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import jakarta.persistence.Entity;

import java.time.LocalDate;


@Entity
@JsonSubTypes({
        @JsonSubTypes.Type(value = Run5km.class, name="run 5"),
        @JsonSubTypes.Type(value = Run10km.class, name="run 10"),
        @JsonSubTypes.Type(value = RunHalfMarathon.class, name="run half")

})
public abstract class Running extends Exercise {

    private Long runningTimeInSeconds;
    private Long secPerKilometer;

    private int distanceInKm;

    public Running(LocalDate scoreDate, Long runningTimeInSeconds) {
        super(scoreDate);
        this.runningTimeInSeconds = runningTimeInSeconds;
    }

    public Running() {
    }

    public Long getRunningTimeInSeconds() {
        return runningTimeInSeconds;
    }

    public void setRunningTimeInSeconds(Long runningTimeInSeconds) {
        this.runningTimeInSeconds = runningTimeInSeconds;
    }

    public Long getSecPerKilometer() {
        return getRunningTimeInSeconds() / getDistanceInKm();
    }

    public void setSecPerKilometer(Long secPerKilometer) {
        this.secPerKilometer = secPerKilometer;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }


    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public String convertSecondsToMinutesPlusSecondsAsString(Long seconds){
        return (int) (Math.floor(seconds/60)) + ":" + seconds % 60;
    }

    @Override
    public String toString() {
        return "Pr in " + " scored at: " + getScoreDate() +
                ". You ran " + getDistanceInKm() + " kilometers at time " +
                convertSecondsToMinutesPlusSecondsAsString(getRunningTimeInSeconds())
                + ". Average speed: " + convertSecondsToMinutesPlusSecondsAsString(getSecPerKilometer());
    }

}
