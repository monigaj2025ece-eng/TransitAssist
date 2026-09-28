package com.transitassist.transitassist.Repository;

import com.transitassist.transitassist.entity.TransitRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransitRequestRepository extends JpaRepository<TransitRequest, Long> {
}
