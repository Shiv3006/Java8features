package com.bnt.domain;

import java.util.List;

public class AtlasSignUp {

	private List<String> request;

	public List<String> getRequest() {
		return request;
	}

	public void setRequest(List<String> request) {
		this.request = request;
	}

	public AtlasSignUp(List<String> request) {
		super();
		this.request = request;
	}
	
	
	
}
