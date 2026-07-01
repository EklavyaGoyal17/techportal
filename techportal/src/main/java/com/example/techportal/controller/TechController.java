package com.example.techportal.controller;

import com.example.techportal.model.TechItem;
import com.example.techportal.service.TechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tech")
public class TechController {
    
    @Autowired
    private TechService techAppService;

    @GetMapping
    public List<TechItem> retrieveModules() {
        return techAppService.fetchAllModules();
    }

    @PostMapping
    public void createModule(@RequestBody TechItem newModuleRequest) {
        techAppService.registerNewModule(newModuleRequest);
    }
}