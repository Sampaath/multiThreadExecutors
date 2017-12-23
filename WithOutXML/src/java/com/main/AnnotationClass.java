package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnotationClass {
	@RequestMapping("/sam")
	public void method() {
		System.out.println("  hello from the otherside");

	}

}
