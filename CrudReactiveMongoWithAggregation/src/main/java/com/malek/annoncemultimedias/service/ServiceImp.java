package com.malek.annoncemultimedias.service;

import com.malek.annoncemultimedias.Documents.Annonce;
import com.malek.annoncemultimedias.Documents.CategoriePrefix;
import com.malek.annoncemultimedias.repositories.ReactiveRepositoryAnnonce;
import com.malek.annoncemultimedias.repositories.ReactiveRepositoryCategoryPrefix;
import com.malek.annoncemultimedias.service.controlles.IAnnonceControlle;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServiceImp implements IAdminService,IInternauteService,IUserService{
    private  ReactiveRepositoryAnnonce repositoryAnnonce ;
    private  ReactiveRepositoryCategoryPrefix repositoryCategoryPrefix ;
    private  IAnnonceControlle annonceControlle ;


    public ServiceImp(ReactiveRepositoryAnnonce repositoryAnnonce, ReactiveRepositoryCategoryPrefix repositoryCategoryPrefix ,IAnnonceControlle annonceControlle) {
        this.repositoryAnnonce = repositoryAnnonce;
        this.repositoryCategoryPrefix = repositoryCategoryPrefix;
        this.annonceControlle=annonceControlle ;
    }

    @Override
    public Mono<Annonce> addAnnonce(Annonce annonce) {

        annonceControlle.checkAnnonceValidity(annonce);
       return repositoryAnnonce.save(annonce);// todo logger

    }

    @Override
    public Mono<Annonce> updateAnnoce(Annonce annonceU) {
/*
         repositoryAnnonce.findById(annonce.getId())
*/
       return repositoryAnnonce.findById(annonceU.getId())
                .doOnSuccess(annonce -> {
                    annonce=annonceU;
                    repositoryAnnonce.save(annonce).subscribe();
                })
          ;//     .doOnError(System.out.println("to do excpetion ")); // todo exception not found
    }

    @Override
    public void deleteAnnove(Annonce annonce) {
         repositoryAnnonce.delete(annonce).subscribe();
    }

    @Override
    public Flux<Annonce> getAllAnnonce() {
        return  repositoryAnnonce.findAll();

    }

    @Override
    public Flux<Annonce> getAnnoncesByCategorie(String catPrefix) {

        return  repositoryAnnonce.getCategorieByRegex(catPrefix) ;

    }

    @Override
    public Flux<Annonce> getAnnoncesByBrand(String fabricantPrefix) {

        return repositoryAnnonce.getAnnonceByFabricant(fabricantPrefix);
    }

    @Override
    public Flux<Annonce> getAnnoceByName(String name) {
        return repositoryAnnonce.getAnnonceByNomLike(name);
    }

    @Override
    public Flux<Annonce> getAnnoceByModel(String model) {
        return repositoryAnnonce.getAnnonceByModel(model);
    }

    @Override
    public Mono<Annonce> getAnnonceDetail(String id) {
        return repositoryAnnonce.findById(id);
    }

    @Override
    public Flux<CategoriePrefix> getAllCategoris() {

        return null;
    }
}
