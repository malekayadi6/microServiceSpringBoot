package com.malek.simpleServiceReactMongo.Controllers;

import com.malek.simpleServiceReactMongo.RepositoriesReactive.ReactiveRepositoryVoiture;
import com.malek.simpleServiceReactMongo.documents.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class GesVoitureController {
    @Autowired
    private ReactiveRepositoryVoiture reactiveRepositoryVoiture ;

    @GetMapping("/voitures")
    private Flux<Voiture> getAllVoiture(){
        return  reactiveRepositoryVoiture.findAll() ;

    }
}
