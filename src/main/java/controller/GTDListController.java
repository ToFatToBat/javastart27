package controller;

import model.GTDList;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import repository.GTDListRepository;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GTDListController {
    GTDListRepository gtdListRepository;

    public GTDListController(GTDListRepository gtdListRepository) {
        this.gtdListRepository = gtdListRepository;
    }

    @GetMapping("/")
    public String index (Model model) {
        List <GTDList> allToDo = gtdListRepository.findGTDListByDeadLineDateAfterOrderByDeadLineDateAsc(java.time.LocalDate.now());
        model.addAttribute("allToDo", allToDo);
        return "index";
    }


}
