package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadingController {

	private static final String template = "placeholder";
	private final AtomicLong counter = new AtomicLong();
	private static final String[] readings = {
			"You will live for 700 years!",
			"You will win the lottery!",
			"You will get good grades on your exams!"
	};

	@GetMapping("/reading")
	public Reading reading() {
		return new Reading(counter.incrementAndGet(), readings[(int) (Math.random()*readings.length)]);
	}
}
