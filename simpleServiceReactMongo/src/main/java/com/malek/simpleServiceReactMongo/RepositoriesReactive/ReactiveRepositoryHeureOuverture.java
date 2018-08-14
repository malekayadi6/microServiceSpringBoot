package com.malek.simpleServiceReactMongo.RepositoriesReactive;

import com.malek.simpleServiceReactMongo.documents.HeureOuverture;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReactiveRepositoryHeureOuverture extends ReactiveMongoRepository<HeureOuverture,String> {
}
