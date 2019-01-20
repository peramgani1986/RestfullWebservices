package com.rest.cont;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.guru.bean.Student;
import com.jax.rs.response.format.StatusBean;

@Path("/stu")
@Component
public class ReceiverController {
	@Autowired(required = true)
	private RestTemplate restTemplate;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/find")
	public Response getAllStudents() {
		String apiUrl = "http://localhost:8080/guruApp/api/students/getAll";
		ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
		System.out.println(response.getBody());

		return Response.ok(null).build();

	}

}
