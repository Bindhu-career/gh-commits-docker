package com.squarepeg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqarepeg.model.RootCommit;
import com.squarepeg.service.AccessGithubService;

@RestController
public class AccessGithubController {

	@Autowired
	private AccessGithubService accessGithubService;

	@GetMapping("/getAllCommits")
	public RootCommit[] getGithubCommits() {
		return accessGithubService.getGithubCommits();
	}
}
