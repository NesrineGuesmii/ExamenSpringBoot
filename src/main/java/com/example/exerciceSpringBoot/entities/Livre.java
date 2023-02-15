package com.example.exerciceSpringBoot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_l;

    private String titre_l;

    private Integer  annee_l;

    private String resume_l;

    private Integer nb_chap_tot;

    @ManyToMany
    private List<Auteur> auteurs;
}
