package com.transitassist.transitassist.Controller;

import com.transitassist.transitassist.entity.Assignment;
import com.transitassist.transitassist.Service.AssignmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    private final AssignmentService service;

    public AssignmentController(AssignmentService service) {
        this.service = service;
    }

    @PostMapping
    public Assignment createAssignment(@RequestBody Assignment assignment) {
        return service.createAssignment(assignment);
    }

    @GetMapping
    public List<Assignment> getAllAssignments() {
        return service.getAllAssignments();
    }

    @GetMapping("/{id}")
    public Assignment getAssignment(@PathVariable Long id) {
        return service.getAssignmentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteAssignment(@PathVariable Long id) {
        service.deleteAssignment(id);
        return "Assignment deleted successfully";
    }
}