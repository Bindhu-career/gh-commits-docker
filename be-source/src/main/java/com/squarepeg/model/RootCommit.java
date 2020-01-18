package com.sqarepeg.model;

import java.io.Serializable;
import java.util.ArrayList;

public class RootCommit  implements Serializable{

	private String sha;
	private String node_id;
	private Commit commit;
	private String url;
	private String html_url;
	private String comments_url;
	private Author author;
	private Author committer;
	private ArrayList<Object> parents;

	public String getSha() {
		return sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
	}

	public String getNode_id() {
		return node_id;
	}

	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public Commit getCommit() {
		return commit;
	}

	public void setCommit(Commit commit) {
		this.commit = commit;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public String getComments_url() {
		return comments_url;
	}

	public void setComments_url(String comments_url) {
		this.comments_url = comments_url;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
 

	public Author getCommitter() {
		return committer;
	}

	public void setCommitter(Author committer) {
		this.committer = committer;
	}

	public ArrayList<Object> getParents() {
		return parents;
	}

	public void setParents(ArrayList<Object> parents) {
		this.parents = parents;
	}

	@Override
	public String toString() {
		return "RootCommit [sha=" + sha + ", node_id=" + node_id + ", commit=" + commit + ", url=" + url + ", html_url="
				+ html_url + ", comments_url=" + comments_url + ", author=" + author + ", committer=" + committer
				+ ", parents=" + parents + "]";
	}

}
