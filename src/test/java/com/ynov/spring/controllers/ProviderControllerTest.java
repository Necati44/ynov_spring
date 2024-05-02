package com.ynov.spring.controllers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class ProviderControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void test1_Providers() throws Exception {
		mockMvc.perform(get("/providers")).andExpect(status().isOk())
		.andExpect(content().string(containsString("Samsung")));
	}
	
	@Test
	void test2_Providers() throws Exception {
		mockMvc.perform(get("/providers")).andExpect(status().isOk())
		.andExpect(content().string(containsString("Orange")));
	}
	
	@Test
	void test3_Providers() throws Exception {
		mockMvc.perform(get("/providers")).andExpect(status().isOk())
		.andExpect(content().string(containsString("HP")));
	}

}
