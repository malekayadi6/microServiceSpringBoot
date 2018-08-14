package com.malek.annoncemultimedias.service;

import com.malek.annoncemultimedias.Documents.Annonce;
import com.malek.annoncemultimedias.Documents.CategoriePrefix;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface IInternauteService  {
    public Flux<Annonce> getAllAnnonce() ;
    public Flux<Annonce> getAnnoncesByCategorie(String catPrefix) ;
    public Flux<Annonce> getAnnoncesByBrand(String fabricantPrefix) ;
    public Mono<Annonce> getAnnonceDetail(String id) ;

    public Flux<CategoriePrefix> getAllCategoris() ;







}
