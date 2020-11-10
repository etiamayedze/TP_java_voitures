package com.example.voiture;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Marque {
    @Id
    private int id;
    private String libelleMarque;
    @OneToMany
    @ManyToMany
    @JoinColumn(name = "marque_id")
    @OrderBy("libelleMarque")
    private List<Voiture> voitures;
    Set <Marque> marques;


}
