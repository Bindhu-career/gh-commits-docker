package com.sqarepeg.model;

import java.io.Serializable;

public class Commit  implements Serializable {

	private Usershot author;
	private Usershot committer;
	private String message;
	private String url;
	private Long comment_count;
	private Verification verification;
	private Tree tree;

	public Usershot getAuthor() {
		return author;
	}

	public void setAuthor(Usershot author) {
		this.author = author;
	}

	public Usershot getCommitter() {
		return committer;
	}

	public void setCommitter(Usershot committer) {
		this.committer = committer;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getComment_count() {
		return comment_count;
	}

	public void setComment_count(Long comment_count) {
		this.comment_count = comment_count;
	}

	public Verification getVerification() {
		return verification;
	}

	public void setVerification(Verification verification) {
		this.verification = verification;
	}

	public Tree getTree() {
		return tree;
	}

	public void setTree(Tree tree) {
		this.tree = tree;
	}

	@Override
	public String toString() {
		return "Commit [author=" + author + ", committer=" + committer + ", message=" + message + ", url=" + url
				+ ", comment_count=" + comment_count + ", verification=" + verification + ", tree=" + tree + "]";
	}

}
