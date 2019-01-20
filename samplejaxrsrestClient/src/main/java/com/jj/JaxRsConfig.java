package com.jj;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JaxRsConfig extends ResourceConfig {
	public JaxRsConfig() {
		packages("com.rest");
	}

}
