package com.malek.simpleServiceReactMongo.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document
public class Annonce implements Serializable {
    @Id
    private String id ;
    private String villeDepart ;
    private String villeArriver ;
    private String heureDepart ;
    private String heureArriver ;
    private String prix ;
    private String typeAnnonce ;
    @Field("voiture")
    private Voiture voiture ;
    private String description ;
    private Integer nbrPlaceDispo ;
    private Date datePublication ;
    private Date dateExpiration ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArriver() {
        return villeArriver;
    }

    public void setVilleArriver(String villeArriver) {
        this.villeArriver = villeArriver;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getHeureArriver() {
        return heureArriver;
    }

    public void setHeureArriver(String heureArriver) {
        this.heureArriver = heureArriver;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getTypeAnnonce() {
        return typeAnnonce;
    }

    public void setTypeAnnonce(String typeAnnonce) {
        this.typeAnnonce = typeAnnonce;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNbrPlaceDispo() {
        return nbrPlaceDispo;
    }

    public void setNbrPlaceDispo(Integer nbrPlaceDispo) {
        this.nbrPlaceDispo = nbrPlaceDispo;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
