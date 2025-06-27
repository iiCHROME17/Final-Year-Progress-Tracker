package com.jbb90.fypt;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/advisors")
public class AdvisorController {
    private final AdvisorService advisorService;

    public AdvisorController(AdvisorService advisorService) {
        this.advisorService = advisorService;
    }

    @GetMapping
    public List<Advisor> getAllAdvisors() {
        return advisorService.getAllAdvisors();
    }

    @PostMapping
    public Advisor createAdvisor(@RequestBody Advisor advisor) {
        return advisorService.saveAdvisor(advisor);
    }
} 