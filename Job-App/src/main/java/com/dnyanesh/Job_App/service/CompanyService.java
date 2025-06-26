package com.dnyanesh.Job_App.service;

import com.dnyanesh.Job_App.entity.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    void addCompany(Company company);
    boolean updateCompany(Company company, Long id);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);

}
