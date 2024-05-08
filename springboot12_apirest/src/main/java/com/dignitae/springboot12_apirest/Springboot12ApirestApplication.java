package com.dignitae.springboot12_apirest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dignitae.springboot12_apirest.entities.services.PersonaService;

@SpringBootApplication
public class Springboot12ApirestApplication implements CommandLineRunner{

    private final PersonaService pr;

    public Springboot12ApirestApplication(PersonaService pr) {
        this.pr = pr;
    }

	public static void main(String[] args) {
		SpringApplication.run(Springboot12ApirestApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
		//Insertamos 10 personas siempre que se inicie la aplicación
        this.pr.initializeDemoData();
    }

}
