package com.transitassist.transitassist.Service;

import com.transitassist.transitassist.entity.Assignment;
import com.transitassist.transitassist.Repository.AssignmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {

    private final AssignmentRepository repository;

    public AssignmentService(AssignmentRepository repository) {
        this.repository = repository;
    }

    public Assignment createAssignment(Assignment assignment) {
        return repository.save(assignment);
    }

    public List<Assignment> getAllAssignments() {
        return repository.findAll();
    }

    public Assignment getAssignmentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteAssignment(Long id) {
        repository.deleteById(id);
    }
}