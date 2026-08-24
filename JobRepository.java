package com.example.JOBNOVA.JOBNOVA.repository;
import com.example.JOBNOVA.JOBNOVA.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    // Custom query method to find jobs containing a skill keyword
    List<Job> findBySkillsContainingIgnoreCase(String skill);
}
