package com.guru.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api")
public class JaxJersyConfig extends ResourceConfig {
	public JaxJersyConfig() {
		packages("com.rest");
	}
}
