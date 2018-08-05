package com.malek.simpleServiceReactMongo.RepositoriesReactive;

import com.malek.simpleServiceReactMongo.documents.Voiture;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReactiveRepositoryVoiture extends ReactiveCrudRepository <Voiture , String> {
}
