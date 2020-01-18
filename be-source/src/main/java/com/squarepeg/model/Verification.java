package com.sqarepeg.model;

import java.io.Serializable;

public class Verification  implements Serializable {
	private boolean verified;
	private String reason;
	private String signature;
	private String payload;

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "Verification [verified=" + verified + ", reason=" + reason + ", signature=" + signature + ", payload="
				+ payload + "]";
	}

}