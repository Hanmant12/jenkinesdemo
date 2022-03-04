package com.example.Demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Demo.Control.Examcontrol;

@SpringBootTest
class FormCrudPractice1ApplicationTests {

	@Autowired
	Examcontrol control;
	@Test
	void contextLoads() {
		assertThat(control.shodat()).isNotEqualTo(4);
		
	}

}
