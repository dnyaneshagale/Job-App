package com.dnyanesh.Job_App.repository;

import com.dnyanesh.Job_App.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
