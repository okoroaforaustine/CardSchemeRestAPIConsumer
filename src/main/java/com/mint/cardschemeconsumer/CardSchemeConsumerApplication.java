package com.mint.cardschemeconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableKafka
@SpringBootApplication
public class CardSchemeConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardSchemeConsumerApplication.class, args);
	}

}
