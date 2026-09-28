package com.transitassist.transitassist.Repository;

import com.transitassist.transitassist.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
