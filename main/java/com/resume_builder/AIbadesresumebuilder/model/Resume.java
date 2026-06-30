package com.resume_builder.AIbadesresumebuilder.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "resumes")
public class Resume {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    // Basic Info
	    @JsonProperty("name")
	    private String fullName;

	    private String phone;
	    private String email;
	    private String address;

	    @JsonProperty("linkedin")
	    private String linkedIn;

	    @JsonProperty("summary")
	    @Column(length = 1000)
	    private String professionalSummary;

	    @Column(length = 500)
	    private String skills;

	    // Experience fields
	    @JsonProperty("jobTitle")
	    private String jobTitle;

	    @JsonProperty("company")
	    private String company;

	    @JsonProperty("duration")
	    private String duration;

	    @Column(length = 1000)
	    private String experience;

	    public void setExperienceFromFrontend() {
	        this.experience = jobTitle + " at " + company + " (" + duration + ")";
	    }

	    // Education fields
	    @JsonProperty("degree")
	    private String degree;

	    @JsonProperty("institute")
	    private String institute;

	    @JsonProperty("graduationYear")
	    private String graduationYear;

	    @JsonProperty("coursework")
	    private String coursework;

	    @Column(length = 1000)
	    private String education;

	    public void setEducationFromFrontend() {
	        this.education = degree + ", " + institute + " (" + graduationYear + ") | " + coursework;
	    }

	    // Projects & certificates
	    @Column(length = 1000)
	    private String projects;

	    @JsonProperty("certificateTitle")
	    private String certificateTitle;

	   

	    @JsonProperty("profileImage")
	    @Column(length = 2000)
	    private String profileImage;

	    // Getters and Setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getFullName() { return fullName; }
	    public void setFullName(String fullName) { this.fullName = fullName; }

	    public String getPhone() { return phone; }
	    public void setPhone(String phone) { this.phone = phone; }

	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }

	    public String getAddress() { return address; }
	    public void setAddress(String address) { this.address = address; }

	    public String getLinkedIn() { return linkedIn; }
	    public void setLinkedIn(String linkedIn) { this.linkedIn = linkedIn; }

	    public String getProfessionalSummary() { return professionalSummary; }
	    public void setProfessionalSummary(String professionalSummary) { this.professionalSummary = professionalSummary; }

	    public String getSkills() { return skills; }
	    public void setSkills(String skills) { this.skills = skills; }

	    public String getJobTitle() { return jobTitle; }
	    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

	    public String getCompany() { return company; }
	    public void setCompany(String company) { this.company = company; }

	    public String getDuration() { return duration; }
	    public void setDuration(String duration) { this.duration = duration; }

	    public String getExperience() { return experience; }

	    public String getDegree() { return degree; }
	    public void setDegree(String degree) { this.degree = degree; }

	    public String getInstitute() { return institute; }
	    public void setInstitute(String institute) { this.institute = institute; }

	    public String getGraduationYear() { return graduationYear; }
	    public void setGraduationYear(String graduationYear) { this.graduationYear = graduationYear; }

	    public String getCoursework() { return coursework; }
	    public void setCoursework(String coursework) { this.coursework = coursework; }

	    public String getEducation() { return education; }

	    public String getProjects() { return projects; }
	    public void setProjects(String projects) { this.projects = projects; }

	    public String getCertificateTitle() { return certificateTitle; }
	    public void setCertificateTitle(String certificateTitle) { this.certificateTitle = certificateTitle; }

	  

	    public String getProfileImage() { return profileImage; }
	    public void setProfileImage(String profileImage) { this.profileImage = profileImage; }
	}