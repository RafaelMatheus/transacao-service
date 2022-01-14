package br.com.wallet.transacao;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableRabbit
@EnableEurekaServer
@EnableMongoRepositories
public class TransacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransacaoApplication.class, args);
	}

}
