package com.jbb90.fypt;

import org.springframework.data.jpa.repository.JpaRepository;
public interface AdvisorRepository extends JpaRepository<Advisor, Long> {
    // Custom query methods (if needed) go here

}
