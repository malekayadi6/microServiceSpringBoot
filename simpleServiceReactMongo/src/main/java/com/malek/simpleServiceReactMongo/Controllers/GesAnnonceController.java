package com.malek.simpleServiceReactMongo.Controllers;


import com.malek.simpleServiceReactMongo.IServices.AnnonceService;

import com.malek.simpleServiceReactMongo.documents.Annonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
public class GesAnnonceController {

/*
    @Autowired
    private ReactiveRepositoryVoiture reactiveRepositoryVoiture ;
    @Autowired
    private ReactiveRepositoryAnnonce reactiveRepositoryAnnonce ;
*/
@Autowired
  private AnnonceService annonceService ;

    @GetMapping("/annonces")
    public Flux<Annonce> getAllAnnoce(){
        return  annonceService.getAllService();

    }


}
