package com.transitassist.transitassist.Controller;

import com.transitassist.transitassist.entity.Staff;
import com.transitassist.transitassist.Service.StaffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    private final StaffService service;

    public StaffController(StaffService service) {
        this.service = service;
    }

    @PostMapping
    public Staff createStaff(@RequestBody Staff staff) {
        return service.createStaff(staff);
    }

    @GetMapping
    public List<Staff> getAllStaff() {
        return service.getAllStaff();
    }

    @GetMapping("/{id}")
    public Staff getStaff(@PathVariable Long id) {
        return service.getStaffById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStaff(@PathVariable Long id) {
        service.deleteStaff(id);
        return "Staff deleted successfully";
    }
}