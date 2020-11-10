package com.example.voiture;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data

public class Adresse {
    @Id
    private int id;
    private String libelleAdresse;
    @ManyToOne
    private Concessionnaire concessionnaire;
}
