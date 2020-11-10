package com.example.voiture;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Concessionnaire {
    @Id
    private int id;
    private String nomConcessionnaire;
    @ManyToMany
    Set <Marque> marques;
}
