package com.jbb90.fypt;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdvisorService {
    private final AdvisorRepository advisorRepository;

    public AdvisorService(AdvisorRepository advisorRepository) {
        this.advisorRepository = advisorRepository;
    }

    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

    public Advisor saveAdvisor(Advisor advisor) {
        return advisorRepository.save(advisor);
    }

    // Add more methods as needed (findById, delete, etc.)
} 