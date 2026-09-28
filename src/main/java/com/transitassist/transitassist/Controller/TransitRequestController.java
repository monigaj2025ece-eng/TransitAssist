package com.transitassist.transitassist.Controller;

import com.transitassist.transitassist.entity.TransitRequest;
import com.transitassist.transitassist.Service.TransitRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class TransitRequestController {

    private final TransitRequestService service;

    public TransitRequestController(TransitRequestService service) {
        this.service = service;
    }

    @PostMapping
    public TransitRequest createRequest(@RequestBody TransitRequest request) {
        return service.createRequest(request);
    }

    @GetMapping
    public List<TransitRequest> getAllRequests() {
        return service.getAllRequests();
    }

    @GetMapping("/{id}")
    public TransitRequest getRequest(@PathVariable Long id) {
        return service.getRequestById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteRequest(@PathVariable Long id) {
        service.deleteRequest(id);
        return "Request deleted successfully";
    }
}