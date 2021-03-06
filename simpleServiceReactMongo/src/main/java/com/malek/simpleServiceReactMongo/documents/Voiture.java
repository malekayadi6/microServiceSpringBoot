package com.malek.simpleServiceReactMongo.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "voiture")
@Data
public class Voiture implements Serializable {
    @Id
    private String id;
    private String typeVoiture ;
    private Integer nombreDeSiege ;
    private Agence agence ;

    private String Description ;
    private String urlVoiture ;


}
