package com.example.JOBNOVA.JOBNOVA.service;



import com.example.JOBNOVA.JOBNOVA.model.Certification;
import com.example.JOBNOVA.JOBNOVA.repository.CertificationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CertificationService {
    private final CertificationRepository repo;
    public CertificationService(CertificationRepository repo) { this.repo = repo; }

    public List<Certification> all() { return repo.findAll(); }
}
