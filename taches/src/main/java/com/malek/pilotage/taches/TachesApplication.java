package com.malek.pilotage.taches;

import com.malek.pilotage.taches.entities.Task;
import com.malek.pilotage.taches.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;




@EnableEurekaClient
@SpringBootApplication
public class TachesApplication implements CommandLineRunner {

	@Autowired
	private TaskRepository taskRepository ;

	public static void main(String[] args) {
		SpringApplication.run(TachesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

/*		taskRepository.save(new Task("dev" , "debut dev  " , new Date() ,new Date() , 1 )) ;
		taskRepository.save(new Task("suivi" , "debut dev  " , new Date() ,new Date() , 1 )) ;*/

	}
}
