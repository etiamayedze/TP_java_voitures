package com.example.voiture;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Client {
    @Id
    private int id;
    private String nomClient;
    private String prenomClient;
    @OneToMany
    @JoinColumn(name = "id_client")
    @OrderBy("nomClient")
    private List<Voiture> voitures;





}
