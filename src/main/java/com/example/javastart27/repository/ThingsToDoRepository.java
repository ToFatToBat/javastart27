package com.example.javastart27.repository;

import com.example.javastart27.model.ThingsToDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThingsToDoRepository extends JpaRepository <ThingsToDo, Long> {

    List<ThingsToDo> findAllByItDoneFalseOrderByDeadLineDateAsc();
}
// findThingsToDoByItDoneFalseOrderByDeadLineDateDeadLineDateAsc