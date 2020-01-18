package com.squarepeg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqarepeg.model.RootCommit;
import com.squarepeg.dao.AccessGithubDao;

@Service
public class AccessGithubService {

	@Autowired
	private AccessGithubDao accessGithubDao;

	public RootCommit[] getGithubCommits() {

		return accessGithubDao.getCOmmitts();
	}
}
