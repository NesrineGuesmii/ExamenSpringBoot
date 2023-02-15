package com.example.exerciceSpringBoot.Repository;

import com.example.exerciceSpringBoot.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByNb_chap_totLessThan(int nb_chap_tot);
}
