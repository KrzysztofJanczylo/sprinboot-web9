package pl.sda.sprinbootweb2.controler;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Zad8_1Controller {

    @GetMapping("/zad8_1/{id}")
    public String zad8_1(@PathVariable(value = "id") String id, Model model){
        model.addAttribute("id", id);

        return "zadanie8_1";
    }
}
