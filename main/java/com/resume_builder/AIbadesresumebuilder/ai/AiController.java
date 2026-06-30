package com.resume_builder.AIbadesresumebuilder.ai;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin("*")

public class AiController {

	    @PostMapping("/generate")
	    public String generateAI(@RequestBody AiRequest req) {

	        String type = req.getType();

	        switch (type) {

	            case "summary":
	                return "Results-driven IT professional with hands-on experience in software development, system analysis, and project implementation. Proficient in modern technologies, agile methodologies, and cross-functional collaboration. Seeking to leverage technical expertise and industry experience to contribute to organizational growth and explore new challenges in a dynamic IT environment.";

	            case "skills":
	                return "•Programming Languages: Python, Java, C++\r\n"
	                		+ "\r\n"
	                		+ "•Web Technologies: HTML, CSS, JavaScript\r\n"
	                		+ "\r\n"
	                		+ "•Database: MySQL, Oracle\r\n"
	                		+ "\r\n"
	                		+ "•Tools: Git, Visual Studio Code, Eclipse \r\n"
	                		+ "\r\n"
	                		+ "•Other Skills: Problem-solving, Communication, Teamwork";
	            case "experience":
	                return "Software Intern|Tech Company|2023 - Present";

	            case "projects":
	                return "• Online Book Store – Developed using Python & MySQL; implemented search and cart functionality.\r\n"
	                		+ "• Portfolio Website – Created responsive website using HTML, CSS, JavaScript.";
	            default:
	                return "Invalid AI request.";
	        }
	    }
	}


