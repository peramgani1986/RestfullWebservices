package com.guru.samplejaxrsrest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SamplejaxrsrestApplicationTests {
	@Autowired
	RestTemplate Template;

	@Test
	public void contextLoads() {
	}

}
