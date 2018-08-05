package com.malek.simpleServiceReactMongo;

import com.malek.simpleServiceReactMongo.RepositoriesReactive.ReactiveRepositoryAnnonce;
import com.malek.simpleServiceReactMongo.documents.Annonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Date;

@EnableEurekaClient
@SpringBootApplication
public class SimpleServiceReactMongoApplication implements CommandLineRunner {

	@Autowired
	private ReactiveRepositoryAnnonce reactiveRepositoryAnnonce ;

	public static void main(String[] args) {
		SpringApplication.run(SimpleServiceReactMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Annonce annonce = new Annonce() ;
		annonce.setDatePublication(new Date());
		annonce.setNbrPlaceDispo(4);
		annonce.setVilleArriver("bardo");
		reactiveRepositoryAnnonce.save(annonce).subscribe(annonc-> System.out.println(annonc.getVilleArriver()));

	}
}
