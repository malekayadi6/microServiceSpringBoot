package com.malek.simpleServiceReactMongo.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document
@Data
public class Pays implements Serializable {
    @Id
    private String id ;
    private String NomPays ;
    private List<Ville> villes ;



}
