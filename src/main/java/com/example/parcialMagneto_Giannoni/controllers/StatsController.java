package com.example.parcialMagneto_Giannoni.controllers;



import com.example.parcialMagneto_Giannoni.dto.StatsResponse;
import com.example.parcialMagneto_Giannoni.services.DnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {

    @Autowired
    private DnaService dnaService;

    @GetMapping
    public StatsResponse getStats() {
        return dnaService.getStats();
    }
}
