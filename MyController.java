package com.example.Spring23.Controller;
import org.springframework.stereotype.Controller;
import org.springframework. web.bind.annotation.GetMapping;

@Controller


public class MyController {
    @GetMapping("/aboutus")
    public String openAboutUs() {
        return "aboutus";
    }

    @GetMapping("/results")
    public String openResults() {
        return "results";
    }
}