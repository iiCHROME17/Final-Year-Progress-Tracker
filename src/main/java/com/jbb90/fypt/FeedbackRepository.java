package com.jbb90.fypt;

import org.springframework.data.jpa.repository.JpaRepository;
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    // Custom query methods (if needed) go here

}
