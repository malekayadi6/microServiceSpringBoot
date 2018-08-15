package com.malek.annoncemultimedias.repositories;

import com.malek.annoncemultimedias.Documents.Annonce;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ReactiveRepositoryAnnonce extends ReactiveMongoRepository<Annonce,String> {
    @Query("{ 'categorie' : { $regex: ?0 } }")
    public Flux<Annonce> getCategorieByRegex(String regex) ;
    public Flux<Annonce> getAnnonceByModel(String model);
    public Flux<Annonce> getAnnonceByNomLike(String name) ;
    public Flux<Annonce> getAnnonceByFabricant(String brand) ;
}
