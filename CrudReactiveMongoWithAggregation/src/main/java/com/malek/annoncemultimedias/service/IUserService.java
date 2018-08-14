package com.malek.annoncemultimedias.service;

import com.malek.annoncemultimedias.Documents.Annonce;
import reactor.core.publisher.Mono;

public interface IUserService extends IInternauteService {
    public Mono<Annonce> addAnnonce(Annonce annonce) ;
    public Mono<Annonce> updateAnnoce(Annonce annonce) ;
    public void deleteAnnove(Annonce annonce) ;





}
