package group4.example.SWP301_project.controller;

import org.springframework.ui.Model;
import group4.example.SWP301_project.service.NongSanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NongSanController {

    @Autowired
    private NongSanService nongSanService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("dsNongSan", nongSanService.findAll());
        return "index";
    }
}

