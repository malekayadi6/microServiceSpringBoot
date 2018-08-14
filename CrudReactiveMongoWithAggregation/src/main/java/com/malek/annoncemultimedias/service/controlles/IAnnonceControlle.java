package com.malek.annoncemultimedias.service.controlles;

import com.malek.annoncemultimedias.Documents.Annonce;
import org.springframework.stereotype.Service;

public interface IAnnonceControlle {
    public void checkAnnonceValidity(Annonce annonce); // todo excpetion controlle

}
