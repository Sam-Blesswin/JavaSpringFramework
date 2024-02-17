package com.example.restapi.controller;

import com.example.restapi.model.JobPost;
import com.example.restapi.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobService service;

    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("/jobPost/{id}")
    public JobPost getJobPost(@PathVariable int id){
        return service.getJobPost(id);
    }
}
