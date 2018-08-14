package com.malek.simpleServiceReactMongo.RepositoriesReactive;

import com.malek.simpleServiceReactMongo.documents.Ville;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReactiveRepositoryVille extends ReactiveMongoRepository<Ville,String> {
}
