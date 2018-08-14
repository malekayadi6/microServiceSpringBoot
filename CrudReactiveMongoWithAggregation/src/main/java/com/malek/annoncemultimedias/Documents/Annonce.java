package com.malek.annoncemultimedias.Documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Document
@Data
public class Annonce  implements Serializable{
    @Id
    private String id ;
    private String nom ;
    private String model ;
    private String description ;
    private String coleur ;
    private String etat ;
    private String prix ;
    private Date dateDeSortie ;
    private Date dateAnnonce ;
    private String ville ;
    private String userId ;
    private List<ImageUrl> imageUrls ;
    private String fabricant ;
    private String categorie ;

}
