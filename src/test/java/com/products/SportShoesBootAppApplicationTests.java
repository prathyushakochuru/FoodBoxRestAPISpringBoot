package com.products;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.products.controller.ProductsCrudController;
import com.products.model.Products;
import com.products.repository.ProductRepository;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@WebMvcTest(ProductsCrudController.class)
class SportShoesBootAppApplicationTests {
	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	ProductRepository prodRepo;
	
	
	Products prod1= new Products(16, "Gourmet Subzi", 14, "Persian", "Persian Non-Veg dish - Chicken slowly cooked in greens and spices");


	
	@Test
	public void updateProductById()  throws Exception{
		
		Products prodnew= new Products(16, "Ghormeh Subzi", 14, "Persian", "Persian Non-Veg dish - Chicken slowly cooked in greens and spices");
		
		Mockito.when(prodRepo.findById(prod1.getId())).thenReturn(java.util.Optional.of(prod1));
		Mockito.when(prodRepo.save(prodnew)).thenReturn(prodnew);
		
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/patient")
	            .contentType(MediaType.APPLICATION_JSON)
	            .accept(MediaType.APPLICATION_JSON)
	            .content(this.mapper.writeValueAsString(prodnew));

	    mockMvc.perform(mockRequest)
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$", notNullValue()))
	            .andExpect(jsonPath("$.productname", is("Ghormeh Subzi")));

	}

}
