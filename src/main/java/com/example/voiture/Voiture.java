package com.example.voiture;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data

public class Voiture {

    @Id
    private int id;
    private String modele;
	private String annee;
    private int nbreChevaux;
    private int numChassis;
    @ManyToOne
    private Marque marque;

    public Voiture(){

    }


}
