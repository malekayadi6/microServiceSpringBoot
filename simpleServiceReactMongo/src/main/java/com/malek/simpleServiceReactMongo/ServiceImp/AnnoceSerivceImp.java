package com.malek.simpleServiceReactMongo.ServiceImp;

import com.malek.simpleServiceReactMongo.IServices.AnnonceService;
import com.malek.simpleServiceReactMongo.RepositoriesReactive.ReactiveRepositoryAnnonce;
import com.malek.simpleServiceReactMongo.documents.Annonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class AnnoceSerivceImp implements AnnonceService {
    @Autowired
    private ReactiveRepositoryAnnonce reactiveRepositoryAnnonce ;


    @Override
    public Mono<Annonce> addService(Annonce annonceMono) {

      return   reactiveRepositoryAnnonce.save(annonceMono) ;
    }

    @Override
    public Flux<Annonce> getAllService() {
     return     reactiveRepositoryAnnonce.findAll();
    }

    @Override
    public Mono<Annonce> getAnnoceById(String id) {
        return null;
    }

    @Override
    public Flux<Annonce> getAnnoceByVilleArrive(String villeArriver) {
        return null;
    }
}
