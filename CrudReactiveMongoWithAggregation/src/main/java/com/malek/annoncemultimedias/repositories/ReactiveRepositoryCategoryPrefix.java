package com.malek.annoncemultimedias.repositories;

import com.malek.annoncemultimedias.Documents.CategoriePrefix;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReactiveRepositoryCategoryPrefix extends ReactiveMongoRepository<CategoriePrefix,String> {

}
