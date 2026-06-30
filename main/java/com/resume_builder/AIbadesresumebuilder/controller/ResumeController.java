package com.resume_builder.AIbadesresumebuilder.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.resume_builder.AIbadesresumebuilder.model.Resume;
import com.resume_builder.AIbadesresumebuilder.repository.ResumeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/resumes")
@CrossOrigin(origins = "*") // allow frontend from any origin

public class ResumeController {
	 @Autowired
	    private ResumeRepository resumeRepository;

	    // GET all resumes
	    @GetMapping
	    public List<Resume> getAllResumes() {
	        return resumeRepository.findAll();
	    }

	    // POST create resume
	    @PostMapping
	    public Resume createResume(@RequestBody Resume resume) {
	        return resumeRepository.save(resume);
	    }

	    // GET resume by ID
	    @GetMapping("/{id}")
	    public Resume getResumeById(@PathVariable Long id) {
	        return resumeRepository.findById(id).orElse(null);
	    }

	    // DELETE resume by ID
	    @DeleteMapping("/{id}")
	    public void deleteResume(@PathVariable Long id) {
	        resumeRepository.deleteById(id);
	    }
	}

