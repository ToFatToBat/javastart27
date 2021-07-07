package com.example.javastart27.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class ThingsToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String toDo;
    private String description;
    private boolean isItDone;
    private LocalDate deadLineDate;

    public ThingsToDo() {
    }

    public ThingsToDo(Long id, String toDo, String description, boolean isItDone, LocalDate deadLineDate) {
        this.id = id;
        this.toDo = toDo;
        this.description = description;
        this.isItDone = isItDone;
        this.deadLineDate = deadLineDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isItDone() {
        return isItDone;
    }

    public void setItDone(boolean itDone) {
        isItDone = itDone;
    }

    public LocalDate getDeadLineDate() { return deadLineDate; }

    public void setDeadLineDate(LocalDate deadLineDate) { this.deadLineDate = deadLineDate; }
}
