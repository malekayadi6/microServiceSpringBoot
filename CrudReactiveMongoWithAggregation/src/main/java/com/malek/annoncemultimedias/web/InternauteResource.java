package com.malek.annoncemultimedias.web;


import com.malek.annoncemultimedias.Documents.Annonce;
import com.malek.annoncemultimedias.service.ServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class InternauteResource {
    private ServiceImp serviceImp ;

    public InternauteResource(ServiceImp serviceImp) {
        this.serviceImp = serviceImp;
    }

    @GetMapping("/annoces")
    public Flux<Annonce> getAllAnnoce(){
        return serviceImp.getAllAnnonce();

    }

    @GetMapping("/cat/{prefix}")
    public Flux<Annonce> getAnnonceByCatPrefix(@PathVariable String prefix){
        return serviceImp.getAnnoncesByCategorie(prefix);

    }



}
