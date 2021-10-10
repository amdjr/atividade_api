package br.adilson.api.com.atividade_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HomeController {
    @GetMapping
    public String index() {
        return "# One Punch Man # by @Adilson_Monteiro";
    }
}