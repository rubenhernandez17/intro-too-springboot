package com.springbootsite.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/example")
    public String example() {
        return "example";
    }
    
    @PostMapping("/submitForm")
    public String submitForm(@RequestParam("name") String name, @RequestParam("email") String email, Model model) {
        // Handle form submission and add result to the model
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "result";
    }

    // Add more methods to map to other pages

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/secondPage")
    public String secondPage() {
        return "secondPage";
    }
}

