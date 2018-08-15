package com.malek.annoncemultimedias.web;

import com.malek.annoncemultimedias.Documents.Annonce;
import com.malek.annoncemultimedias.service.ServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class UserResource {
    private ServiceImp serviceImp ;


    public UserResource(ServiceImp serviceImp) {
        this.serviceImp = serviceImp;
    }

    @PostMapping("/add")
    public Mono<Annonce> addNewAnnoce(@RequestBody Annonce annonce){
        return serviceImp.addAnnonce(annonce);

    }
    @PutMapping("/update")
    public Mono<Annonce> updateAnnone(@RequestBody Annonce annonce){

        return serviceImp.updateAnnoce(annonce) ;
    }
    @DeleteMapping("/delete")
    public String deleteAnnove(@RequestBody Annonce annonce){
         serviceImp.deleteAnnove(annonce) ;
         return "delete ";
    }




}
