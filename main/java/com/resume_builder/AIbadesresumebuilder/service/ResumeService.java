package com.resume_builder.AIbadesresumebuilder.service;
import com.resume_builder.AIbadesresumebuilder.model.Resume;
import java.util.List;
import java.util.Optional;
public interface ResumeService {
	  Resume saveResume(Resume resume);
	    List<Resume> getAllResumes();
	    Optional<Resume> getResumeById(Long id);
	    Resume updateResume(Long id, Resume resume);
	    void deleteResume(Long id);
}
