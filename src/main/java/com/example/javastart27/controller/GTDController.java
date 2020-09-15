package com.example.javastart27.controller;

import com.example.javastart27.model.GTD;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.javastart27.repository.ThingsToDoRepository;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GTDController {
    ThingsToDoRepository thingsToDoRepository;

    private GTDController(ThingsToDoRepository thingsToDoRepository) {
        this.thingsToDoRepository = thingsToDoRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<ThingsToDo> allToDo = thingsToDoRepository.findThingsToDoByItDoneFalseOrderByDeadLineDateDeadLineDateAsc();
        model.addAttribute("allToDo", allToDo);
        return "index";
    }


}
