package com.transitassist.transitassist.Repository;

import com.transitassist.transitassist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
