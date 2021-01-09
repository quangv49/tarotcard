package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadingController {

	private final AtomicLong counter = new AtomicLong();
	private static final String[] readings = {
			"You will live for 700 years!",
			"You will win the lottery!",
			"You will get good grades on your exams!",
			"Your base will belong to us!",
			"You will say \"This is fine\"!",
			"Your house will be assaulted by birds!",
			"Trees will sing your name!",
			"Your kneecaps will be safe....for now!"
	};

	@GetMapping("/reading")
	public Reading reading() {
		return new Reading(counter.incrementAndGet(), readings[(int) (Math.random()*readings.length)]);
	}
}
