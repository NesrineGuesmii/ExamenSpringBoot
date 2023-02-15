package com.example.exerciceSpringBoot.Repository;

import com.example.exerciceSpringBoot.entities.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {
}
