package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoController {
	@GetMapping("/curso")
    public String curso(Model model) {
        model.addAttribute("texto", "Sistemas para Internet");
        return "curso";
    }

}
