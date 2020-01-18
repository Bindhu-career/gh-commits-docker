package com.squarepeg.dao;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sqarepeg.model.RootCommit;
import com.squarepeg.utils.SquarepegConstants;

@Component
public class AccessGithubDao {

	RestTemplate restTemplate = new RestTemplate();

	public RootCommit[] getCOmmitts() {
		return restTemplate.getForObject(SquarepegConstants.URL, RootCommit[].class);
	}
}
