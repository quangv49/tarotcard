package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
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
	public String reading(Model model) {
		String reading = readings[(int) (Math.random()*readings.length)];
		model.addAttribute("reading", reading);
		return "reading";
	}
}
