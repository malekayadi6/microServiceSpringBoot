package com.malek.annoncemultimedias;

import com.malek.annoncemultimedias.Documents.Annonce;
import com.malek.annoncemultimedias.repositories.ReactiveRepositoryAnnonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class annoncemultimediasApplication implements CommandLineRunner {


	@Autowired
	private ReactiveRepositoryAnnonce repositoryAnnonce ;
	public static void main(String[] args) {
		SpringApplication.run(annoncemultimediasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Annonce annonce = new Annonce() ;
		annonce.setCategorie("47874");
		annonce.setFabricant("Appel");
		annonce.setColeur("blanc");
		annonce.setDescription("iphone x ");
		repositoryAnnonce.save(annonce).subscribe() ;*/

	/*repositoryAnnonce.findById("5b72087744ddc34fe4b473e6")
			.doOnSuccess(annonce -> {
				annonce.setColeur("mm");
				repositoryAnnonce.save(annonce).subscribe();
			}).subscribe();*/

	}
}
