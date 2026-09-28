package com.transitassist.transitassist.Service;

import com.transitassist.transitassist.entity.TransitRequest;
import com.transitassist.transitassist.Repository.TransitRequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransitRequestService {

    private final TransitRequestRepository repository;

    public TransitRequestService(TransitRequestRepository repository) {
        this.repository = repository;
    }

    public TransitRequest createRequest(TransitRequest request) {
        return repository.save(request);
    }

    public List<TransitRequest> getAllRequests() {
        return repository.findAll();
    }

    public TransitRequest getRequestById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteRequest(Long id) {
        repository.deleteById(id);
    }
}
