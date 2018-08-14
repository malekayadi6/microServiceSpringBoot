package com.malek.simpleServiceReactMongo.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Data
public class JourOuverture implements Serializable {
    @Id
    private String id ;
    private String jours ;
    private HeureOuverture heureOuverture ;




}
