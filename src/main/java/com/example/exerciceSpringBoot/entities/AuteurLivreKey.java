package com.example.exerciceSpringBoot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuteurLivreKey implements Serializable {
    @Column(name = "auteur_id")
    private Long auteurId ;
    @Column(name = "livre_id")
    private Long livreId;
}
