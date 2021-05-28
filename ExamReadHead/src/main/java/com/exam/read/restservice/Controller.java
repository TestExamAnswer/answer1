package com.exam.read.restservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exam.read.utils.Utils;

@RestController
public class Controller {

	@Autowired
	Utils utils;

	private static final String template = "Headers requested, %s!";

	@GetMapping("/greeting")
	public Greeting greeting(@RequestHeader Map<String, String> headers,
			@RequestParam(value = "name", defaultValue = "World") List<String> names) {
		Map<String, List<String>> headersLst = new HashMap<String, List<String>>();
		headers.forEach((k, v) -> headersLst.put(k, Arrays.asList(v.split(","))));

		List<Integer> numberInput = new ArrayList<Integer>();
		numberInput.add(1);
		numberInput.add(2);
		numberInput.add(2);
		numberInput.add(4);
		numberInput.add(4);
		numberInput.add(3);
		numberInput.add(4);
		numberInput.add(5);
		numberInput.add(6);

		return new Greeting(String.format(template, names), utils.getHeaders(headersLst, names), utils.removeDuplicates(numberInput));
	}
}