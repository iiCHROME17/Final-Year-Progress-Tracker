package com.jbb90.fypt;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/milestones")
public class MilestoneController {
    private final MilestoneService milestoneService;

    public MilestoneController(MilestoneService milestoneService) {
        this.milestoneService = milestoneService;
    }

    @GetMapping
    public List<Milestone> getAllMilestones() {
        return milestoneService.getAllMilestones();
    }

    @PostMapping
    public Milestone createMilestone(@RequestBody Milestone milestone) {
        return milestoneService.saveMilestone(milestone);
    }
} 