package com.example.exerciceSpringBoot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_a;

    private String nom_a;

    private String prenom_a;

    private LocalDate date_naissance_a;

   @ManyToMany
    private List<Livre> livres;

}
