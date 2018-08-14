package com.malek.simpleServiceReactMongo.RepositoriesReactive;

import com.malek.simpleServiceReactMongo.documents.Voiture;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReactiveRepositoryVoiture extends ReactiveMongoRepository<Voiture , String> {
}
