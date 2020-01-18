package com.sqarepeg.model;

import java.io.Serializable;

public class Tree  implements Serializable{

	private String sha;
	private String url;
	public String getSha() {
		return sha;
	}
	public void setSha(String sha) {
		this.sha = sha;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Tree [sha=" + sha + ", url=" + url + "]";
	}
	
	
}
