package panomete.playground.mqusecase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MqusecaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqusecaseApplication.class, args);
	}

}
