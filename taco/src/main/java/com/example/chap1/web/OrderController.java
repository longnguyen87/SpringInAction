package com.example.chap1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.chap1.domain.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping
public class OrderController {
	@GetMapping("/current")
	public String orderForm(Model model) {
		model.addAttribute("order", new Order());
		return "orderForm";
	}
}
