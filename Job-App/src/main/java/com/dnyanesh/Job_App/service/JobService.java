package com.dnyanesh.Job_App.service;

import com.dnyanesh.Job_App.entity.Job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void createJob(Job job);
    Job getJobById(Long id);
}
