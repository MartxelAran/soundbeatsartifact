package edu.soundbeatsproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "", "/" })
public class IndexController {

    @GetMapping({ "", "/" })
    public String getHome() {
        return "home";
    }

    @GetMapping({ "/error"})
    public String getError() {
        return "error";
    }
}
