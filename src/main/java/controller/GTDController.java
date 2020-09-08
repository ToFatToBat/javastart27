package controller;

import model.GTD;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import repository.GTDRepository;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GTDController {
    GTDRepository gtdRepository;

    public GTDController(GTDRepository gtdRepository) {
        this.gtdRepository = gtdRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<GTD> allToDo = gtdRepository.findGTDByItDoneFalseOrderByDeadLineDateDeadLineDateAsc();
        model.addAttribute("allToDo", allToDo);
        return "index";
    }


}
