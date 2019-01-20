package com.rest.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.guru.bean.Student;
import com.guru.service.StudentService;
import com.jax.rs.response.format.StatusBean;

@Path("/students")
@Component
public class StudentController {
	@Autowired
	private StudentService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAll")
	public Response getAllStudents() {
		List<Student> studnets = service.getAllStudents();
		StatusBean bean = new StatusBean();
		bean.setData(studnets);
		return Response.ok(bean).build();

	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/add")
	public Response saveData(Student data) {
		service.saveData(data);
		StatusBean bean = new StatusBean();
		bean.setData(null);
		return Response.ok(bean).build();

	}

}
