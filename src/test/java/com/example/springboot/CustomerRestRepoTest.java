package com.example.springboot;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class CustomerRestRepoTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void get() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/customers").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
		// .andExpect(jsonPath("$[0].name", is("bob"))
	}

}
