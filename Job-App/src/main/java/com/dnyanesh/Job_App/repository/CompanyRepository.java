package com.dnyanesh.Job_App.repository;

import com.dnyanesh.Job_App.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
