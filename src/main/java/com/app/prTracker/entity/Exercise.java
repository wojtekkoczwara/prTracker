package com.app.prTracker.entity;

import com.app.prTracker.entity.exercises.Running;
import com.app.prTracker.entity.exercises.Weightlifting;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;

import java.beans.ConstructorProperties;
import java.time.LocalDate;


@Entity
@Table(name = "exercise")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "exerciseName")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Weightlifting.class, name="weightlifting"),
        @JsonSubTypes.Type(value = Running.class, name="running"),
})
public abstract class Exercise {

    @TableGenerator(name = "tableGenerator", allocationSize = 1, initialValue = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
    generator = "tableGenerator")
    private int id;

//    private String disciplineName;


    private LocalDate scoreDate;



    public Exercise(LocalDate scoreDate) {
//        this.disciplineName = disciplineName;
        this.scoreDate = scoreDate;
    }

    @ConstructorProperties("{exerciseName}")
    public Exercise() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getScoreDate() {
        return scoreDate;
    }

    public void setScoreDate(LocalDate scoreDate) {
        this.scoreDate = scoreDate;
    }

    @Override
    public String toString() {
        return "Discipline { " +
                "id=" + id +
                ", scoreDate=" + scoreDate +
                " } ";
    }
}

