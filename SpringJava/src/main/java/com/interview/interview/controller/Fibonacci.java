package com.interview.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.interview.service.service;

@RestController
@RequestMapping("interview")
public class Fibonacci {

	@Autowired
	private service ser;
	@GetMapping("fibonacci/{n}")
	public int[] bubbleSort(@PathVariable int n){
		int[] arr=ser.fib(n);
		return arr;
	}
	
	
}
