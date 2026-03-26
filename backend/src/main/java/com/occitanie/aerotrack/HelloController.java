package com.occitanie.aerotrack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String direBonjour() {
        return "Bonjour Toulouse ! Mon backend AeroTrack est en ligne 🚀";
    }
}