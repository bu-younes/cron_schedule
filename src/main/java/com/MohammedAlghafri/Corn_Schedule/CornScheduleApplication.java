package com.MohammedAlghafri.Corn_Schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CornScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CornScheduleApplication.class, args);
	}

}
