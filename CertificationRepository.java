package com.example.JOBNOVA.JOBNOVA.repository;
import com.example.JOBNOVA.JOBNOVA.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificationRepository extends JpaRepository<Certification, Long> {
    // Default CRUD operations are automatically available
}
