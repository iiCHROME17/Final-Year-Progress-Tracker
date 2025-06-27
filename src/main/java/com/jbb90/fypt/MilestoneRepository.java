package com.jbb90.fypt;

import org.springframework.data.jpa.repository.JpaRepository;
public interface MilestoneRepository extends JpaRepository<Milestone, Long> {
    // Custom query methods (if needed) go here

}
