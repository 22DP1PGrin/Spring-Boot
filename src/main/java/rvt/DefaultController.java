package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    @GetMapping(value = "/about")
    String aboutme(Model model){
        String name="Patricija";
        String surname="Griņičeva";
        int age = 16;
        String group="DP2-1";
        model.addAttribute("name",name);
        model.addAttribute("surname",surname);
        model.addAttribute("age",age);
        model.addAttribute("group",group);
        return "about";
    }
}
