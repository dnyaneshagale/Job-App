package com.dnyanesh.Job_App.service.impl;

import com.dnyanesh.Job_App.entity.Company;
import com.dnyanesh.Job_App.repository.CompanyRepository;
import com.dnyanesh.Job_App.repository.JobRepository;
import com.dnyanesh.Job_App.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final JobRepository jobRepository;
    private CompanyRepository companyRepository;
    public CompanyServiceImpl(CompanyRepository companyRepository, JobRepository jobRepository) {
        this.companyRepository = companyRepository;
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public boolean updateCompany(Company updatedCompany, Long id) {
        Optional<Company> companyOptional = companyRepository.findById(id);

        if (companyOptional.isPresent()) {

            Company companyToUpdate = companyOptional.get();

            companyToUpdate.setDescription(updatedCompany.getDescription());
            companyToUpdate.setName(updatedCompany.getName());
            companyToUpdate.setJobs(updatedCompany.getJobs());

            companyRepository.save(companyToUpdate);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteCompanyById(Long id) {
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

}
