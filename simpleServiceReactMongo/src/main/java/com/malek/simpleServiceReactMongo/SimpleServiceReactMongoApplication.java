package com.malek.simpleServiceReactMongo;

import com.malek.simpleServiceReactMongo.RepositoriesReactive.ReactiveRepositoryAgence;
import com.malek.simpleServiceReactMongo.RepositoriesReactive.ReactiveRepositoryAnnonce;
import com.malek.simpleServiceReactMongo.RepositoriesReactive.ReactiveRepositoryVoiture;
import com.malek.simpleServiceReactMongo.documents.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EnableEurekaClient
@SpringBootApplication
public class SimpleServiceReactMongoApplication implements CommandLineRunner {

	@Autowired
	private ReactiveRepositoryAnnonce reactiveRepositoryAnnonce ;
	@Autowired
	private ReactiveRepositoryVoiture reactiveRepositoryVoiture ;
	@Autowired
	private ReactiveRepositoryAgence reactiveRepositoryAgence ;

	public static void main(String[] args) {
		SpringApplication.run(SimpleServiceReactMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/*		reactiveRepositoryAnnonce.c().thenMany(
				Flux.just("tunis","bardo","ariena" , "manouba" , "lac 1 " , "lac 2 ","malekzzzzz")
						.map(title-> new Annonce(title)))
						.flatMap(reactiveRepositoryAnnonce::save)
				        .filter(annonce -> annonce.getVilleArriver().length() > 8)
						.subscribe(reactiveRepositoryAnnonce::save);*/

		Ville ville=new Ville() ;
		ville.setNomVille("marsa");
		Ville ville1=new Ville();
		ville1.setNomVille("ariena");
		Pays pays = new Pays() ;
		pays .setNomPays("Tunis") ;
		List<Ville> villes = new ArrayList<>() ;
		villes.add(ville);
		villes.add(ville1) ;
		pays.setVilles(villes);
		Agence agence = new Agence() ;
		agence.setNomAgence("agnce 1 ");
		agence.setPays(pays);


		Voiture voiture= new Voiture() ;
		voiture.setDescription("mmmm");
		voiture.setAgence(agence);

     reactiveRepositoryVoiture.save(voiture);//.log().subscribe() ;
     reactiveRepositoryAgence.findAll().log().subscribe(System.out::println);
   //  reactiveRepositoryVoiture.findAll().log().subscribe(System.out::println);











				//.subscribe(System.out::println)
	//	) ;
	/*	reactiveRepositoryAnnonce.deleteAll().thenMany(
				Flux.just("tunis","bardo","ariena" , "manouba" , "lac 1 " , "lac 2 ")
				.map(ville -> {
					Annonce an=new Annonce();
					an.setVilleArriver(ville);

				}).flatMap(ano ->reactiveRepositoryAnnonce.save(ano)))
				.subscribe(
						reactiveRepositoryAnnonce.findAll().subscribe(annonc -> System.out.println(annonc.getVilleArriver()))
				);

*/
	/*	Annonce annonce = new Annonce() ;
		annonce.setDatePublication(new Date());
		annonce.setNbrPlaceDispo(4);
		annonce.setVilleArriver("bardo");
*//*
		reactiveRepositoryAnnonce.deleteAll().flatMap()
*//*
		reactiveRepositoryAnnonce.save(annonce).subscribe(annonc-> System.out.println(annonc.getVilleArriver()));
*/
	}
}
