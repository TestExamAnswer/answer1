package com.exam.read.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("utils")
public class Utils {

	public Map<String, List<String>> getHeaders(Map<String, List<String>> input, List<String> find) {

		Map<String, List<String>> output = new HashMap<String, List<String>>();

		find.stream().forEach(s -> {
			if (input.containsKey(s)) {
				output.put(s, input.get(s));
			}
		});

		return output;
	}

	public List<Integer> removeDuplicates(List<Integer> input) {

		List<Integer> output = new ArrayList<Integer>();

		for (int i : input) {
			if (output.isEmpty()) {
				output.add(i);
			}
			if (!existElement(i, output)) {
				output.add(i);
			}
		}

		output.sort((x,y)-> x.compareTo(y));
		return output;
	}

	protected boolean existElement(int find, List<Integer> input) {
		boolean response = false;
		for (int i : input) {
			if (i == find)
				response = true;
		}
		return response;
	}

}
