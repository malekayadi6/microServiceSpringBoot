package com.malek.pilotage.taches.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Task implements Serializable {
    @Id
    @GeneratedValue
    private Long idTask ;
    private String nomTask ;
    @Column(length = 244)
    private String description ;
    private Date dateDebut ;
    private Date dateFin ;
    private Integer duree ;

    public Task() {
    }

    public Task(String nomTask, String description, Date dateDebut, Date dateFin, Integer duree) {
        this.nomTask = nomTask;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.duree = duree;
    }

    public Long getIdTask() {
        return idTask;
    }

    public void setIdTask(Long idTask) {
        this.idTask = idTask;
    }

    public String getNomTask() {
        return nomTask;
    }

    public void setNomTask(String nomTask) {
        this.nomTask = nomTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }
}
