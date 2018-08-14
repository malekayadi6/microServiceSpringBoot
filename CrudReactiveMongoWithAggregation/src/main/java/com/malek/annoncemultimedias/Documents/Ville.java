package com.malek.annoncemultimedias.Documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Data
public class Ville implements Serializable {
    @Id
    private String id ;
    private String nom ;
    private String latitude ;
    private String longitude ;
}
