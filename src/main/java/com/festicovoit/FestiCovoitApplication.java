package com.festicovoit;

import com.festicovoit.entity.dbo.UserParticipantDbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;

@SpringBootApplication
public class FestiCovoitApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FestiCovoitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserParticipantDbo userParticipant = new UserParticipantDbo("password", "test@gmail.com",
				"Tony", "CHEVRIS", 3720596L, new Date("18/11/2019"),
				"51 rue Pierre Brossolette", 51100, "Reims");
	}
}
