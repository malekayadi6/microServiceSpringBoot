package com.malek.simpleServiceReactMongo.IServices;

import com.malek.simpleServiceReactMongo.documents.Annonce;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AnnonceService {

    public Mono<Annonce> addService(Annonce annonceMono) ;
    public Flux<Annonce> getAllService() ;
    public Mono<Annonce> getAnnoceById(String id) ;
    public Flux<Annonce> getAnnoceByVilleArrive(String villeArriver) ;


}
