package com.example.Chetting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/chat")
    public String chat() {
        return "chat"; // Matches "chat.html" in the templates folder
    }
}

