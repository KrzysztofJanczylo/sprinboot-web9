package pl.sda.sprinbootweb2.controler;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Zad9Controller {


    @GetMapping("/zad9")
    public String zad9(@RequestParam(value = "text", required = false) String text, Model model){
        model.addAttribute("text", text);
        return "zad9";
    }
}
