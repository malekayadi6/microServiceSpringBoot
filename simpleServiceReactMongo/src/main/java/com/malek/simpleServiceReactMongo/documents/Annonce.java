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
    private String description ;
    private Ville ville ;


}
