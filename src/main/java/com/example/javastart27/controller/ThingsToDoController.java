package com.example.javastart27.controller;

import com.example.javastart27.model.ThingsToDo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.javastart27.repository.ThingsToDoRepository;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ThingsToDoController {
    ThingsToDoRepository thingsToDoRepository;

    private ThingsToDoController(ThingsToDoRepository thingsToDoRepository) {
        this.thingsToDoRepository = thingsToDoRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<ThingsToDo> allToDo = thingsToDoRepository.findAllByisItDoneFalseOrderByDeadLineDateAsc();
        model.addAttribute("allToDo", allToDo);
        return "index";
    }


}
