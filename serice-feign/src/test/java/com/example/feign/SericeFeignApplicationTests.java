package com.example.feign;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaAutoServiceRegistration;

@SpringBootTest
class SericeFeignApplicationTests {
	@MockBean
	private EurekaAutoServiceRegistration eurekaAutoServiceRegistration;

	@Test
	void contextLoads() {
	}

}
