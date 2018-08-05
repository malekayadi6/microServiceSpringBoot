package com.malek.simpleServiceReactMongo.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "voiture")
public class Voiture implements Serializable {
    @Id
    private String id;
    private String typeVoiture ;
    private String Matricule ;
    private Integer maxNombreDeplace ;
    private String Description ;
    private String urlVoiture ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeVoiture() {
        return typeVoiture;
    }

    public void setTypeVoiture(String typeVoiture) {
        this.typeVoiture = typeVoiture;
    }

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
    }

    public Integer getMaxNombreDeplace() {
        return maxNombreDeplace;
    }

    public void setMaxNombreDeplace(Integer maxNombreDeplace) {
        this.maxNombreDeplace = maxNombreDeplace;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrlVoiture() {
        return urlVoiture;
    }

    public void setUrlVoiture(String urlVoiture) {
        this.urlVoiture = urlVoiture;
    }
}
