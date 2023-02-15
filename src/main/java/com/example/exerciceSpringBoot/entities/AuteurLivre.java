package com.example.exerciceSpringBoot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuteurLivre implements Serializable {
   @EmbeddedId
    private AuteurLivreKey id;

    @ManyToOne
    @MapsId("auteur_id")
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

    @ManyToOne
    @MapsId("livre_id")
    @JoinColumn(name = "livre_id")
    private Livre livre;

    private Integer nb_chap;

}
