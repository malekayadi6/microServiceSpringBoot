package com.malek.annoncemultimedias.Documents;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Data
public class CategoriePrefix implements Serializable {
    private String id ;
    private String nomCat;
    private String lang ;
    private String prefix;

}
