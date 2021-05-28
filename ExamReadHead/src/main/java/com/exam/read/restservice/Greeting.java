package com.exam.read.restservice;

import java.util.List;
import java.util.Map;

public class Greeting {

	private final Map<String, List<String>> headersLst;
	private final String content;
	private final List<Integer> listWithoutDuplicates;

	public Greeting(String content, Map<String, List<String>> headersLst, List<Integer> listWithoutDuplicates) {
		this.content = content;
		this.headersLst = headersLst;
		this.listWithoutDuplicates = listWithoutDuplicates;
	}

	public String getContent() {
		return content;
	}

	public Map<String, List<String>> getHeadersLst() {
		return headersLst;
	}

	public List<Integer> getListWithoutDuplicates() {
		return listWithoutDuplicates;
	}
	
	
}