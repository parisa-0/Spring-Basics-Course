package com.example.estars;
//run the methods from service class, display result sets on a html file
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EstarsController {

    @Autowired
    private EstarsService service;

    @GetMapping("/vhp")
    public String viewHomePage(Model model) {
        List<Estars> allStudents = service.showAllStarsFound();
        model.addAttribute("allStudents", allStudents);
        return "index"; //return index.html
    }

    @RequestMapping("/delete/{id}") {
        public String deleteEstars(@PathVariable(name = "id") int id) {
          service.delete(id);
          return "redirect:/vhp";
        }
    }
}
