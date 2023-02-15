package com.example.exerciceSpringBoot.Repository;

import com.example.exerciceSpringBoot.entities.AuteurLivre;
import com.example.exerciceSpringBoot.entities.AuteurLivreKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurLivreRepository extends JpaRepository<AuteurLivre, AuteurLivreKey> {
}
