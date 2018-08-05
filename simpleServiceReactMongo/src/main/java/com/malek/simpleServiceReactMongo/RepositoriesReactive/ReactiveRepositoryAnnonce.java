package com.malek.simpleServiceReactMongo.RepositoriesReactive;

import com.malek.simpleServiceReactMongo.documents.Annonce;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface ReactiveRepositoryAnnonce extends ReactiveCrudRepository<Annonce , String> {


}
