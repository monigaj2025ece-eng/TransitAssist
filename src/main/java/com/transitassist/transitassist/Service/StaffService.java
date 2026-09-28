package com.transitassist.transitassist.Service;

import com.transitassist.transitassist.entity.Staff;
import com.transitassist.transitassist.Repository.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffRepository repository;

    public StaffService(StaffRepository repository) {
        this.repository = repository;
    }

    public Staff createStaff(Staff staff) {
        return repository.save(staff);
    }

    public List<Staff> getAllStaff() {
        return repository.findAll();
    }

    public Staff getStaffById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteStaff(Long id) {
        repository.deleteById(id);
    }
}
